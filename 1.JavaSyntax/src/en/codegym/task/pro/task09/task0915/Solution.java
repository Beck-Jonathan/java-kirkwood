package en.codegym.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
This also won't validate, but it's doing exactly what's asked.
Moving on...
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        String[] tokens = new String[6];
        int i = 0;
        StringTokenizer tokenizer = new StringTokenizer(query,delimiter);
        while (tokenizer.hasMoreTokens()){
            tokens[i]=tokenizer.nextToken();
            i++;
        }
        String[] tokens2 = new String[i];
        for (int j =0;j<i;j++){
            tokens2[j]="\""+tokens[j]+"\"";
        }
        return tokens2;
    }
}
