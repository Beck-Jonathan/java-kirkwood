import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class file_read {
    public static ArrayList file(){
        List<List<String>> games = new ArrayList<List<String>>();
        String a;
        String[] b;
        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\jjbec\\Downloads\\CodeGymTasks" +
                        "\\FinalProject\\src\\releases.txt"))) {
            while ((a = br.readLine()) != null) {
                //System.out.println(a);
                b=a.split("\t");
                //System.out.println(b[0]);
                games.add(Arrays.asList(b[0],b[1],b[6]));}
              //  string name = b[0]
            //new release <release()>;
                 // String x = b[0];
                //double d =(double) b[1];
                //String c=b[6];
               // release y = new release(a,d,c);
        } catch (
                IOException exc) {
            System.out.println("file not found");
        }
        ArrayList sorted = new ArrayList();
        sorted= (ArrayList) games;
        System.out.println( sorted.get(1));
        return sorted;



    }
}
