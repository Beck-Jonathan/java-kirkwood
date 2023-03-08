package chapter_5_6;

public class quiz_doodles {
    public static void main(String[] args) {
        System.out.println("hello world");
        int x = 5;
        if (x < 10) {
            System.out.println("x is less than 10");
        } else if (x < 20) {
            System.out.println("x is between 10 and 20");
        } else {
            System.out.println("x is greater than 20");
        }
        double test = 4.475478;
        System.out.printf("%,.4f", test);
        System.out.println("");
        int term = 10;
        int termy= (term<11)? 5 : 6;
        System.out.println(termy);
    }
}
