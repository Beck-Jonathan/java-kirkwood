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
        //char data type requires single quotes '', it can only contain a single character
        String myName = "Jonathan";
        char firstCharacter = myName.charAt(0);
        char lastCharacter = myName.charAt(myName.length() - 1);
        char secondCharacter = myName.charAt(1);
        System.out.println("my chars are" + firstCharacter + secondCharacter + lastCharacter);
        //Boolean, don't capitalize true or false
        boolean handsom = true;
        boolean ugly = false;
        //slashes quotes to make quotes look right
        System.out.println("first line \nsecond line");
        System.out.println("The mascot is \"Eddie The eagle\"");
        //calculate are of circle
        double radius = 2.5;
        double areaOfCircle = Math.PI * radius * radius;
        double areaOtherVersion = Math.PI * Math.pow(radius, 2);
        System.out.println(areaOfCircle);
        double heightofCyl = 6;
        double areaOfCyl = areaOfCircle * heightofCyl;
        System.out.printf("A cylinder with a radius of %.1f" +
                "and a height of %.1f has an area of %.2f\n", radius, heightofCyl, areaOfCyl);
  //a whole lecture on objects happened
        for (int i = 0; i <5;i++) {
            System.out.println(i);
        }
        //i no longer exists after the for loop, i is "scooped"
       // System.out.println(i);
        int i;
        for( i=0;i<5;i++) {
            System.out.println(i);
        }
        System.out.println(i);
        //in this above loop i is scoped to the main method, allowing us access outside of the loop

        }
    }
}