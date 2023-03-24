package com.census;

public class DelimiterException extends RuntimeException{
    @Override
    public String toString(){
        return "separator is not correct in CSV file";
    }
}
