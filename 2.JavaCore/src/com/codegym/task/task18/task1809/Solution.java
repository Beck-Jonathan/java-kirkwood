package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String fileName;
        String filename1;

        fileName = in.readLine();
        filename1 = in.readLine();



        FileInputStream input = new FileInputStream(fileName);
        FileOutputStream outputStream1 = new FileOutputStream(filename1);

        int length = input.available();
        int [] datalist = new int[input.available()];
        int i =0;





        while (input.available()>0){
            int data = input.read();
            datalist[i]=data;
            i++;
        }
        for (int k = datalist.length-1;k>=0;k--){
            outputStream1.write(datalist[k]);
        }

        input.close();

        outputStream1.close();

    }
}