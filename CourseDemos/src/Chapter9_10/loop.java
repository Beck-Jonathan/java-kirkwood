package Chapter9_10;

public class loop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1;sum<50;i+=2){
            sum = sum + i;
            if (sum%3==0 || sum%5 ==0){continue;}
            System.out.println(sum);
        }
    }
}
