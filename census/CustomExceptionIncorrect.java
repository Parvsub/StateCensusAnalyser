package com.census;

import java.io.FileNotFoundException;

public class CustomExceptionIncorrect extends FileNotFoundException {
    @Override
    public String toString(){
        return "File is error";
    }
}
