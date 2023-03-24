package com.census;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritetoFiles {
    public void csvWriter() throws IOException{
        File file = new File("Praveen.CSV");
        FileWriter  fileWriter = new FileWriter(file);
        CSVWriter writer = new CSVWriter(fileWriter);

        String[] line1 = {"id","State","population","literacy"};
        String[] line2 = {"1","TamilNadu","100234","Eighty"};
        String[] line3 = {"2","Madhya pradesh","134000","SeventyFive"};
        String[] line4 = {"3","Andhra Pradesh","2000000","Ninty"};
        writer.writeNext(line1);
        writer.writeNext(line2);
        writer.writeNext(line3);
        writer.writeNext(line4);
        writer.close();
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        WritetoFiles files = new WritetoFiles();
        files.csvWriter();
    }
}
