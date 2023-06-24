package org.example;

import java.io.*;
public class App 
{
    public static void main( String[] args ) {
        String currentLine;

        try(BufferedReader br = new BufferedReader(new FileReader("src/main/resources/text.txt"));
            BufferedWriter wr = new BufferedWriter(new FileWriter("src/main/resources/outputText.txt"))) {

            while((currentLine = br.readLine())!=null){
                if(currentLine.length()>3){
                    if(currentLine.charAt(1) == '.'){
                        currentLine = currentLine.substring(3);
                    }
                    else {
                        currentLine = currentLine.substring(4);
                    }
                    wr.write(currentLine + "\n");
                }
                else{
                    wr.write("\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
