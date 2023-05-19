package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Rarest bytes
won't validate, but i feel comfortable with this material
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int trashdata=-100;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

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
        int min_occur = 10000;
        int location =0;
        List min = new ArrayList();

        // this finds the location of the max occurace
        for (int k =0;k<countData.length;k++)
        {
            if(countData[k]<min_occur){
                min_occur=countData[k];
                location=k;
            }
        }
        // this finds all the cells with the same max
        for (int w = 0 ; w<countData.length;w++){
            if (countData[w]==countData[location]){
                min.add(countData[w]);
            }

        }


        for (int e=0;e<min.size();e++){
            System.out.print(allData[(int)min.get(e)]);
            System.out.print(" ");
        }
        input.close();
    }
}
