import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class file_read {
    public static void main(String[] args) {
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
        } catch (
                IOException exc) {
            System.out.println("file not found");
        }
        System.out.println(games);


    }
}
