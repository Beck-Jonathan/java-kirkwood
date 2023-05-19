package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            Integer min= Integer.MAX_VALUE;
            String fileName;
            fileName = in.readLine();
            FileInputStream input = new FileInputStream(fileName);
            while (input.available()>0){
                int data = input.read();

                if (data<min){
                    min = data;
                }
            }

            System.out.println(min);
            input.close();
        }
    }

