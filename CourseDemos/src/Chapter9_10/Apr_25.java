package Chapter9_10;

public class Apr_25 {
    public static void main(String[] args) {
       int [] arr = {649,73,1258};
       Integer k =0;
       int x=0;
       for (int i =0;i<arr.length;i++)
       {
           k=arr[i];
           String y=k.toString();
           x=y.length()-1;
           while (x>=0){
               System.out.print(y.charAt(x));

               x--;
           }
           System.out.println();
       }




    }




}
