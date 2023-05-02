package org.example;

import java.io.File;
import java.util.ArrayList;

public class CsvAnalyser {
    File path;
    ArrayList<String[]> stings = new ArrayList< String[]>();

    public static CsvAnalyser getCsvAnalyser(String path){
        File tmpPath = new File(path);
        if(tmpPath.exists() && tmpPath.canRead()) return new CsvAnalyser(tmpPath);
        return null;
    }

    private CsvAnalyser(File path){
        this.path = path;
    }
}
