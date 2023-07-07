import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        WordCounterMultiThread myCount = WordCounterMultiThread.getWordCounterMultiThread(args);
        assert myCount != null;
        myCount.countWords();
        //FileInputStream fis = new FileInputStream(args[0]);
        //InputStreamReader isr = new InputStreamReader(fis);

    }
}