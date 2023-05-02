package org.example;

public class App 
{
    public static void main( String[] args )
    {
        CsvAnalyser instance = CsvAnalyser.getCsvAnalyser("/home/zakhar/STUDING/Learning/lab8/src/main/resources/sales_data_sample.csv");
        assert instance != null;
        instance.readCSV();
        instance.print5largestTransactions();

    }
}
