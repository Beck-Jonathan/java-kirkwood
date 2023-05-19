package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String fileName;
        fileName = in.readLine();
        FileInputStream input = new FileInputStream(fileName);
        int length = input.available();

        int i = 0;
        //add all data to a list
        while (input.available() > 0) {
            char data = (char)input.read();
            if (data==','){
                i++;
            }
        }
        input.close();
        System.out.println(i);
    }
}