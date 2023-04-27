import java.io.File;

public class WordCounterMultiThread {

    int threadNumber;

    public WordCounterMultiThread getWordCounterMultiThread(String[] args) {
        if (args.length != 2) return null;
        File filePath = new File(args[0]);
        if (!filePath.exists() || !filePath.canRead()) return null;
        try{
            threadNumber = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e){
            return null;
        }

        return null;
    }

    private WordCounterMultiThread(String[] args) {

    }

}
