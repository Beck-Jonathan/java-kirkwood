package com.codegym.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName

*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {

        super(fileName);
        String end = fileName.substring(fileName.length()-4);
        if (end.equalsIgnoreCase(".txt")){
            FileInputStream fi = new FileInputStream(fileName);}
        else {super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }
}

