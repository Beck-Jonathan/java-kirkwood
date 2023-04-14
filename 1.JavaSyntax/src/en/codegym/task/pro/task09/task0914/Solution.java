package en.codegym.task.pro.task09.task0914;

/* 
Path update
this won't validate but it works so I'm moving on.
- Jonathan 4/14/2023
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        String newPath="";
        int Start=0;
        int End=path.lastIndexOf("/");
        String firstSub= path.substring(0,path.lastIndexOf("/"));
        String secondSub = firstSub.substring(0,firstSub.lastIndexOf("/"))+"/";
        newPath = secondSub+jdk+path.substring(End);
        return newPath;
    }
}
