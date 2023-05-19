package com.codegym.task.task18.task1810;

/* 
DownloadException

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException, DownloadException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String fileName;





        while (true) {
            fileName = in.readLine();


            FileInputStream inputStream = new FileInputStream(fileName);
            if (inputStream.available() < 1000) {
                inputStream.close();
                throw new DownloadException();
            } else {
                while (inputStream.available() > 0) {
                    int data = inputStream.read();
                }
                inputStream.close();

            }
        }
    }




    public static class DownloadException extends Exception {

    }
}
