import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fraction fraction1 = new Fraction();
        System.out.println(fraction1);
        Fraction fraction2 = new Fraction(27, 6);
        System.out.println(fraction2);
        System.out.println(fraction2.getNumerator());
        System.out.println(fraction2.getDenominator());
        fraction2.setNumerator(30);
        fraction2.setDenominator(45);
        System.out.println(fraction2);
        Fraction fraction3 = null;
        try {
            fraction3 = new Fraction(3, 0);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            fraction2.setDenominator(0);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        int x =Fraction.greatestCommonDivisor(75,45);
        System.out.println(x);
        int y =Fraction.greatestCommonDivisor(2,4);
        System.out.println(y);
        int z =Fraction.greatestCommonDivisor(5,7);
        System.out.println(z);

        Fraction fraction4 = new Fraction(75,45);
        System.out.println(fraction4.simplify().toString());

        Fraction fraction5 = new Fraction(2,4);
        System.out.println(fraction5.simplify().toString());

        Fraction fraction6 = new Fraction(5,7);
        System.out.println(fraction6.simplify().toString());

        Fraction fraction7 = new Fraction(-2,4);
        System.out.println(fraction7.simplify().toString());

        Fraction fraction8 = new Fraction(2,-4);
        System.out.println(fraction8.simplify().toString());

        Fraction fraction9 = new Fraction(-2,-4);
        System.out.println(fraction9.simplify().toString());

        Fraction fraction10 = new Fraction(4,1);
        System.out.println(fraction10.mixedNumber());

        Fraction fraction11 = new Fraction(0,4);
        System.out.println(fraction11.mixedNumber());

        Fraction fraction12 = new Fraction(4,4);
        System.out.println(fraction12.mixedNumber());

        Fraction fraction13 = new Fraction(8,4);
        System.out.println(fraction13.mixedNumber());

        Fraction fraction14 = new Fraction(4,8);
        System.out.println(fraction14.mixedNumber());

        Fraction fraction15 = new Fraction(13,5);
        System.out.println(fraction15.mixedNumber());

        Fraction fraction16 = new Fraction(-13,5);
        System.out.println(fraction16.mixedNumber());

        Fraction fraction17 = new Fraction(13,-5);
        System.out.println(fraction17.mixedNumber());

        Fraction fraction18 = new Fraction(-13,-5);
        System.out.println(fraction18.mixedNumber());

        Fraction fraction19 = new Fraction(-4,-5);
        System.out.println(fraction19.mixedNumber());

        Fraction fraction20 = new Fraction (13,5);
        Fraction fraction21 = new Fraction(4,8);
        System.out.println(fraction20.Add(fraction21));
        Fraction fraction22 = new Fraction(-13,-5);
        Fraction fraction23 = new Fraction(13,-5);
        System.out.println(fraction22.Add(fraction23));




    }
}
