package Chapter9_10;

import java.time.LocalDate;
import java.util.Date;

public class April_18 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("test2");
        String grass = "green";

        System.out.println(grass.equals("green") ? "enjoy the grass" : (grass.equals("brown") ? "Water it!" : "look at the snow!"));
        int second= 90;
        for (int first =65; first<91;first++){
            if (first==80){
                continue; //skips the letter P
            }
            if (first == 90){break;} //ends when we hit Z
            // return   would braek out of the entire method
            while (second>=65){

                System.out.print((char)first);
                System.out.println((char)second);

                second--;
            }
            second=92;
            int x =10;
            LocalDate y = LocalDate.now();
            // print date and account balance of some bank object
            // x = bank.getbalance()
            // y = localdate.now();
            System.out.println("Your current balance is: "+ x + "and the current date is" + "" );

            // Know what happens when you assign an object to a new reference
            // variable and modify one of the references

            //
            String[] animals = {"cat","dog","gus"};
            String[] animals2=animals;
            animals2[1] = "sq";

            /// public into compareto(book o)
            //{}complare to
               //     it will reutrn a negative or postiive. 0 or negative means in the correct order
               //     postive needs to be swqalled

        }
    }

}
