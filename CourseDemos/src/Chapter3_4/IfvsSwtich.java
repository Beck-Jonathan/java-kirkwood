package Chapter3_4;

public class IfvsSwtich {
    public static void main(String[] args) {
        double annualIncmoe = 65000;
        int taxBracket = 0;
        double taxes;
        double taxRate = 0;

        if (annualIncmoe < 20000) {
            taxBracket = 0;
        } else if (annualIncmoe < 45000) {
            taxBracket = 1;
        } else if (annualIncmoe < 70000) {
            taxBracket = 2;
        } else if (annualIncmoe < 100000) {
            taxBracket = 3;
        } else if (annualIncmoe < 130000) {
            taxBracket = 4;
        } else if (annualIncmoe < 160000) {
            taxBracket = 5;
        } else {
            taxBracket = 6;
        }
        switch (taxBracket) {
            case 0: {
                taxRate = .10;
                break;
            }
            case 1: {
                taxRate = .12;
                break;
            }
            case 2: {
                taxRate = .22;
                break;
            }
            case 3: {
                taxRate = .24;
                break;
            }
            case 4: {
                taxRate = .32;
                break;
            }
            case 5: {
                taxRate = .35;
                break;
            }
            case 6: {
                taxRate = .37;
                break;
            }
        }
        taxes = taxRate * annualIncmoe;
        System.out.printf("You are in the tier %d tax bracket, your tax rate is %.2f, you owe $%.2f", taxBracket, taxRate, taxes);

    }
}



