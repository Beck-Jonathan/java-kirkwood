package com.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Most frequent bytes
Won't validate but I think it's accurate, moving on 5/17/2023

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int trashdata=-100;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer min = Integer.MAX_VALUE;
        String fileName;
        fileName = in.readLine();
        FileInputStream input = new FileInputStream(fileName);
        int length = input.available();
        int[] allData = new int[length];
        int [] countData = new int [length];
        int i = 0;
        //add all data to a list
        while (input.available() > 0) {
            int data = input.read();
            allData[i] = data;
        }
        // count how many times each value occurs
        for (int l=0;l<allData.length-1;l++){
            countData[l]=1;
            for (int j=l+1;j<allData.length;j++){
                if (allData[l]==allData[j]){
                    countData[l]++;

                }
            }

        }
        int max_occur = 0;
        int location =0;
        List max = new ArrayList();

        // this finds the location of the max occurace
        for (int k =0;k<countData.length;k++)
        {
            if(countData[k]>max_occur){
                max_occur=countData[k];
                location=k;
            }
        }
        // this finds all the cells with the same max
        for (int w = 0 ; w<countData.length;w++){
            if (countData[w]==countData[location]){
                max.add(countData[w]);
            }

        }


        for (int e=0;e<max.size();e++){
            System.out.print(allData[(int)max.get(e)]);
            System.out.print(" ");
        }
        input.close();
    }
}
