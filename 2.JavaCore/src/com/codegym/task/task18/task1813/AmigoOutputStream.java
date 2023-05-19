package com.codegym.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



/* 
AmigoOutputStream

*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream _fo;


    public AmigoOutputStream(FileOutputStream stream) throws FileNotFoundException {
        super(fileName);
        _fo=stream;

    }

    public void write(byte[] b) throws IOException {
        _fo.write(b);
    }
    public void write(int b) throws IOException {
        _fo.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        _fo.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        _fo.flush();
    }

    @Override
    public void close() throws IOException {
        _fo.flush();
        String append = "CodeGym © All rights reserved.";
        _fo.write(append.getBytes());
        _fo.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));

    }


}
