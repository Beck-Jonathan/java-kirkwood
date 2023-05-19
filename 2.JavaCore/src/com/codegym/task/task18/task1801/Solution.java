package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer max= Integer.MIN_VALUE;
        String fileName;
        fileName = in.readLine();
        FileInputStream input = new FileInputStream(fileName);
        while (input.available()>0){
            int data = input.read();

            if (data>max){
                max = data;
            }
        }

        System.out.println(max);
        input.close();
    }
}
