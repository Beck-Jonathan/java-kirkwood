import java.math.BigInteger;

public class Fraction {
    private int numerator;
    private  int denominator;

     public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }


    public Fraction(int numerator, int denominator) {
         setNumerator(numerator);
        setDenominator(denominator);
    }
    public int getNumerator(){
        return this.numerator;
    }
    public void setNumerator (int numerator){
        this.numerator=numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }
    public void setDenominator (int denominator){
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can not be zero");
        }
            this.denominator = denominator;

    }
    public static int greatestCommonDivisor(int num1, int num2){
        BigInteger i = BigInteger.valueOf(num1).gcd(BigInteger.valueOf(num2));
        int gcd = Integer.parseInt(i.toString());
        return gcd;
    }

    public Fraction simplify(){
        int gcd = greatestCommonDivisor(this.numerator, this.denominator);
        int newNumerator = this.numerator / gcd;
        int newDenominator = this.denominator / gcd;
        if (newNumerator >= 0 && newDenominator < 0){
            newNumerator = newNumerator * -1;
            newDenominator = newDenominator * -1;
        } else if (newNumerator < 0 && newDenominator < 0){
            newNumerator = newNumerator * -1;
            newDenominator = newDenominator * -1;
        }
        Fraction f = new Fraction(newNumerator, newDenominator);
        return f;
    }

    public  String  mixedNumber(){
        String xx=" ";
        Fraction g = this.simplify();
        Integer x = g.getDenominator();
        Integer y = g.getNumerator();
        if (x==0){return  y.toString();}
        else if (y==0){return "0";}
        else if (x==y){return "1";}
        else if (y>x){
            Integer whole = y/x;
            Integer remainder = y%x;
            if (remainder == 0) {
                return whole.toString();
            }
            String result = whole.toString()+" "+remainder.toString()+ "/" + x.toString();
            return result;}
        else if(y<0&& Math.abs(y)>Math.abs(x)){
            Integer whole = y/x;
            Integer remainder = -y%x;
            String result = whole.toString()+" "+remainder.toString()+ "/" + x.toString();
            return result;}
        else {return g.toString();}


        }
    public String Add(Fraction other){
        int a = this.numerator;
        int b = this.denominator;
        int c = other.getNumerator();
        int d = other.getDenominator();
        int addedNumerator = a*d + c*b;
        int addedDenominator = b * d;
        Fraction f = new Fraction(addedNumerator, addedDenominator);
        String fraction1 = this.mixedNumber();
        String fraction2 = other.mixedNumber();
        String addedFraction = f.mixedNumber();
        String result = fraction1 + " + " + fraction2 + " = " + addedFraction;
        return result;
    }
    public String Subtract(Fraction other){
        int a = this.numerator;
        int b = this.denominator;
        int c = other.getNumerator();
        int d = other.getDenominator();
        int addedNumerator = a*d - c*b;
        int addedDenominator = b * d;
        Fraction f = new Fraction(addedNumerator, addedDenominator);
        String fraction1 = this.mixedNumber();
        String fraction2 = other.mixedNumber();
        String subFraction = f.mixedNumber();
        String result = fraction1 + " - " + fraction2 + " = " + subFraction;
        return result;
    }
    public String Multiply(Fraction other){
        int a = this.numerator;
        int b = this.denominator;
        int c = other.getNumerator();
        int d = other.getDenominator();
        int multNumerator = a*c;
        int multDenominator = b * d;
        Fraction f = new Fraction(multNumerator, multDenominator);
        String fraction1 = this.mixedNumber();
        String fraction2 = other.mixedNumber();
        String multFraction = f.mixedNumber();
        String result = fraction1 + " * " + fraction2 + " = " + multFraction;
        return result;
    }
    public String Divide(Fraction other){
        int a = this.numerator;
        int b = this.denominator;
        int c = other.getNumerator();
        int d = other.getDenominator();
        int multNumerator = a*d;
        int multDenominator = b * c;
        Fraction f = new Fraction(multNumerator, multDenominator);
        String fraction1 = this.mixedNumber();
        String fraction2 = other.mixedNumber();
        String divFraction = f.mixedNumber();
        String result = fraction1 + " / " + fraction2 + " = " + divFraction;
        return result;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

}