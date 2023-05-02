package org.example;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CsvAnalyser {
    File path;
    HashMap<String, Double> transactions;

    public static CsvAnalyser getCsvAnalyser(String path) {
        File tmpPath = new File(path);
        if (tmpPath.exists() && tmpPath.canRead()) return new CsvAnalyser(tmpPath);
        return null;
    }

    private CsvAnalyser(File path) {
        this.path = path;
        transactions = new HashMap<>();
    }

    public void readCSV() {
        try (FileInputStream fis = new FileInputStream(path)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            String tmpTransaction;
            boolean skipFirstLineFlag = true;
            while ((tmpTransaction = reader.readLine()) != null) {
                    try{
                        transactions.put(tmpTransaction.replace(",", " "), Double.parseDouble(tmpTransaction.split(",")[4]));
                    }
                    catch (NumberFormatException e){
                        continue;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void print5largestTransactions(){
        transactions.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Double>comparingByValue().reversed())
                .limit(5).map(Map.Entry::getKey).forEach(System.out::println);
    }
}
