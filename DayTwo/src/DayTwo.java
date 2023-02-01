public class DayTwo {
    // A Java program begins with a call to main().
    public static void main(String args[]) {
        double weight_on_earth = 155;
        double weight_on_moon;
        weight_on_moon = weight_on_earth / 6;
        System.out.println(weight_on_moon);
        int age = 16;
        if (age > 18) {
            System.out.println("congrats you can drive");
            System.out.println("you can go to the casino");
        }
        int count = 5;
        //print 0 to one less than 22
        for (int i = 0; i < 22; i++) {
            System.out.println(i);
        }
        // print 0 to 22
        for (int k = 0; k < 11; k += 2) {
            System.out.println(k);
        }
        //updated gallons converter
        double liters;
        int gallons, counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.754;
            System.out.printf("%d gallons is %.2f liters \n", gallons, liters);
            counter++;
            if (counter == 10) {
                System.out.println("--------");
                counter = 0;
            }
            //level 2 for code gym idea
            //a static method belongs to the class
            //you call the class name followed by . then the method name
            //a non-static method requries you to instattiate an object
            //then you call the object followed by the method name
            int my_age=30;
            String name ="Jonathan Beck";
            String classroom="306";

            //ints to strings
            String string_age=Integer.toString(my_age);
            System.out.println(string_age);
            //strings to ints
            int int_room=Integer.parseInt(classroom);
            System.out.println(int_room);


            //string method 1 ) length
            System.out.println(name.length());


            //string methhod 2 ) to lower case
            System.out.println(name.toLowerCase());

            //string method 3) to upper case
            System.out.println(name.toUpperCase());
            //a whole leacure on object oriented stuff


        }
    }
}

