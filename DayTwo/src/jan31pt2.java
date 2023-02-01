import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class jan31pt2 {
    // A Java program begins with a call to main().
    public static void main(String args[]) {
        System.out.println("hello world");
        long reallybignumber = 99999999999L;
        float floating = 99.22f;
        //to make java know it's a long, you have to put a capital L
        // to make float know it's a flaot, you have to put a lower case f
        //Jave has a math class
        int base = 3;
        int height = 4;
        double hyp = Math.sqrt(base * base + height * height);
        System.out.println(hyp);
        //notes on max and min
        //Max only works on two values at a time, so you do a lot o nesting, bah!
        int max = Math.max(Math.max(8, 1), 9);
        System.out.println(max);

        //this giant mess is a java ii thing,
        //python lists and java array lists work similar
        //java has interesting array types which are fixed length
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(8, 1, 9, 2, 7));
        int max2 = Collections.max(numbers);
        System.out.println(max2);
    }
}