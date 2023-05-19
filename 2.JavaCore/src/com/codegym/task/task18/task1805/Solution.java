package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Double.valueOf;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String fileName;
        fileName = in.readLine();
        FileInputStream input = new FileInputStream(fileName);
        int length = input.available();
        int[] allData = new int[length];
        List uniquedata = new ArrayList();

        int i = 0;
        //add all data to a list
        while (input.available() > 0) {
            int data = input.read();
            if (!uniquedata.contains(data)){
                uniquedata.add(data);
            }
        }
        Collections.sort(uniquedata);
        for (int q =0;q<uniquedata.size();q++){
            System.out.print(uniquedata.get(q)+" ");
        }
        input.close();
    }
}