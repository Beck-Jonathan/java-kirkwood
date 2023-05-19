package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            String fileName;
            String filename1;
            String filename2;
            fileName = in.readLine();
            filename1 = in.readLine();
            filename2 = in.readLine();


            FileInputStream input = new FileInputStream(fileName);
            FileOutputStream outputStream1 = new FileOutputStream(filename1);
            FileOutputStream outputStream2 = new FileOutputStream(filename2);
            int length = input.available();
            if (length%2!=0){length++;}

            int i = 0;
            //add all data to a list
            while (i<length/2) {
                char data = (char)input.read();
                outputStream1.write(data);
                i++;

                }
            while (input.available()>0){
                char data = (char)input.read();
                outputStream2.write(data);
            }

            input.close();
            outputStream2.close();
            outputStream1.close();

        }
    }

