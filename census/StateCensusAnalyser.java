package com.census;

import com.opencsv.CSVReader;

import java.io.*;
import java.util.ArrayList;

public class StateCensusAnalyser {

    public int loadAnalyzer() throws Exception{
        int count = 0,lineNumber = 0;
        ArrayList<Census> censusList = new ArrayList<>();
        File file;
        CSVReader reader;
        try {
            try {
                file = new File("C:\\Users\\bodap\\OneDrive\\Desktop\\Assignment problem\\Census\\Census.txt");
                reader = new CSVReader(new FileReader(file));
            }catch (RuntimeException e){
                throw new CustomExceptionIncorrect();
            }

            String[] line;
            try {
                while ((line = reader.readNext()) != null) {
                    if (lineNumber == 0) {
                        lineNumber++;
                        continue;
                    }
                    ++count;
                    try {
                        censusList.add(new Census(Integer.valueOf(line[0]), line[1],line[2]));
                    } catch (NumberFormatException e) {
                        throw new TypeIncorrect();
                    }
                }
            }catch (com.opencsv.exceptions.CsvMalformedLineException e){
                throw new DelimiterException();
            }
            if(count!=censusList.size()-1){
                throw new CustomExceptionIncorrect();
            }
            censusList.forEach(System.out::println);

        }catch (CustomExceptionIncorrect e){
            System.out.println(e);
        }catch (TypeIncorrect exp){
            System.out.println(exp);
        }catch (DelimiterException exception){
            System.out.println(exception);
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        StateCensusAnalyser analyzer = new StateCensusAnalyser();
        int c = analyzer.loadAnalyzer();
        System.out.println(c);
    }
}

