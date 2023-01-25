import org.w3c.dom.ls.LSOutput;

/*
   This is a simple Java program.
 */
public class DayOne {
    // A Java program begins with a call to main().
    public static void main(String args[]) {
        System.out.println("Java drives the Web.");
        //example 2
        String myName = "Jonathan";
        System.out.println(myName);
        char myGradeInPython = 'a';
        System.out.println(myGradeInPython);
        int age = 35;
        System.out.println(age);
        System.out.println(Integer.MAX_VALUE);
        double myWeight = 158.43;
        System.out.println(myWeight);
        Double gasInCar = 8.75;
        long reallyBigNumber = Long.MAX_VALUE;
        System.out.println(reallyBigNumber);
        byte myToes = 3;
        System.out.println(myToes);
        boolean doILikePizza = false;
        Boolean likesSQL = true;

        //example 3, use shift+f10 to run from here
        // int division
        int x=11;
        int y=3;
        System.out.println(x/y);//3
        System.out.println(x%y);//2
        //double division. If you have a float or double anywhere your result
        // will have a decimal
        double  a = 7;
        int b = 2;
        System.out.println(a/b);//3.5
        System.out.println(a%b);//1.0
        //Some chat about strings
        String firstName = "Jonathan";
        String lastName = "Beck";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        double acctBalance=1000.232323;
        //%s is the substituion variable, and it pull vales from the comma list at the end
        // of the function. %d can be used for digit
        System.out.printf("My name is %s %s and I am %d years old. I have " +
                "$%.2f  in my checking account \n" ,firstName,lastName,age,acctBalance);
        //floating point test
        //this bit has some nonsese with rounding errors
        System.out.println(2-1.1);
        //This bit formats the result to one decimal place
        System.out.printf("%.1f\n", 2 - 1.1);
        //reassign variables. Set data type first time assigneing variable
        String bunnyName = "Cocoa";
        System.out.println(bunnyName);
        // You do not need to set data type second time assignging variable,
        //In fact, you can not change the variable type.
        bunnyName="Gus";
        System.out.println(bunnyName);
        //concat ane string and nonsesne, use parenthesis to avoid concatination
        int G=56;
        int H=4;
        System.out.println("the answer is" +G+H);
        System.out.println("The answer is" +(G+H));
        //after break, example 4?
        //initilzie  multiple at once examples
        int length,width;
        length=3;
        width=4;
        //initialize raidus, initialize and assign height, weird.
        int radius, height=2;
        //various ways to increment
        System.out.println(length);
        //dpn't say "length equals blah blah
        //rather say "assign the value blah blah
        length=length+=1;
        System.out.println(length);
        length++;
        System.out.println(length);
        ++length;
        System.out.println(length);

        //math interesting
        int q=15;
        int w=q / 6;
        double e=q / 6.0;
        int r =q*3;
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(r);
        System.out.println('q'+'w'+'e'+'r');


    }
}