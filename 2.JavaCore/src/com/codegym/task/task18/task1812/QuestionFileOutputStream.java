package com.codegym.task.task18.task1812;

import java.io.*;
import java.util.Scanner;

/* 
Extending AmigoOutputStream

*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream _amigo;
    public QuestionFileOutputStream (AmigoOutputStream amigo){
        _amigo = amigo;
    }

    @Override
    public void flush() throws IOException {
        _amigo.flush();

    }

    @Override
    public void write(int b) throws IOException {
        _amigo.write(b);

    }

    @Override
    public void write(byte[] b) throws IOException {
        _amigo.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        _amigo.write(b,off,len);

    }

    @Override
    public void close() throws IOException {
        System.out.println("Do you really want to close the stream? Y/N");
        Scanner scanner = new Scanner(System.in);
        String reply = scanner.nextLine();
        if (reply.equals("Y")){
            _amigo.close();

        }

    }
}

