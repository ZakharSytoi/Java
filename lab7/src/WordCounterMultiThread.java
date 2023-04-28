import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class WordCounterMultiThread {

    private final int threadNumber;
    private final File path;
    private final HashMap<String, Integer> words;
    private final AtomicInteger currentStart;

    public static WordCounterMultiThread getWordCounterMultiThread(String[] args) {
        if (args.length != 2) return null;
        File tmpPath = new File(args[0]);
        int tmpThreadNumber;
        if (!tmpPath.exists() || !tmpPath.canRead()) return null;
        try {
            tmpThreadNumber = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            return null;
        }
        return new WordCounterMultiThread(tmpPath, tmpThreadNumber);
    }

    public void countWords() {
        InputStreamReader inputStream;
        try (FileInputStream is = new FileInputStream(path)) {
            inputStream = new InputStreamReader(is);
            int character;
            ArrayList<String> lines = new ArrayList<>();
            StringBuilder tmpLine = new StringBuilder();
            while ((character = inputStream.read()) != -1) {
                if ((char) character == '\n') {
                    lines.add(tmpLine.toString());
                    tmpLine.setLength(0);
                    continue;
                }
                tmpLine.append((char) character);
            }
            lines.add(tmpLine.toString());
            Thread[] threads = new Thread[threadNumber];
            int[] linesHandledByThread = new int[threadNumber];
            for (int i = 0; i < threadNumber; i++) {
                threads[i] = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int currentThreadStart = getCurrentThreadStart();
                        for (int lineNumber = currentThreadStart; lineNumber < lines.size(); lineNumber += threadNumber) {
                            for (String str : lines.get(lineNumber).
                                    replaceAll("[^\\p{L}\\p{N}]", " ").
                                    replaceAll("\\s+", " ").
                                    toLowerCase().split(" ")) {
                                addToWords(str);
                            }
                            linesHandledByThread[currentThreadStart]++;
                        }
                    }
                });
            }

            for (Thread i : threads) {
                i.start();
            }
            for (Thread i : threads) {
                i.join();
            }
            LinkedList<Map.Entry<String, Integer>> toSort = new LinkedList<>(words.entrySet());
            toSort.sort(new MyEntryComparator());
            toSort.forEach(System.out::println);
            System.out.println();
            for (int i = 0; i < threads.length; i++) {
                System.out.println("Thread " + (i + 1) + " handled " + linesHandledByThread[i] + " lines");
            }

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    private synchronized int getCurrentThreadStart() {
        int threadCurrentStart = currentStart.get();
        currentStart.incrementAndGet();
        return threadCurrentStart;
    }

    private WordCounterMultiThread(File path, int threadNumber) {
        this.path = path;
        this.threadNumber = threadNumber;
        words = new HashMap<>();
        currentStart = new AtomicInteger(0);
    }

    private synchronized void addToWords(String word) {
        if (word.length() < 2) return;
        if (words.containsKey(word)) {
            words.put(word, words.get(word) + 1);
        } else words.put(word, 1);
    }

    private static class MyEntryComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o1.getKey().compareTo(o2.getKey()) == 0 ? o1.getValue().compareTo(o2.getValue()) : o1.getKey().compareTo(o2.getKey());
        }
    }

}
