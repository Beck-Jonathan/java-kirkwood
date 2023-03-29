package chapter_7_8;

public class Mar28 {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println();

        int x = whatsItDo();
        System.out.println(x);
        Distance dist1 = new Distance(50);
        dist1.decrease(100);
        dist1.increase(200);
        System.out.println(dist1.getDistance());
        fruits(-2);
        int ban=mystery(5);
        System.out.println(ban);
        preAndPost(2);
        doMath();
    }
    public static int whatsItDo() {
        int result = 0;
        for(int k = 10; k > 0; k = k - 2) {
            result += k;
        }
        return result;
    }
    static class Distance {
        double myDistance=0;
        public Distance(double myDistance) { this.myDistance = myDistance; }
        public void increase(double amount) { myDistance += amount; }
        public void decrease(double amount) { myDistance -= amount; }
        public double getDistance() { return myDistance; }
    }
    public static void fruits(int q) {
        if (q < -2)
            System.out.println("Apple");
        System.out.println("Pear");
        if (q <=-2)
            System.out.println("Orange");
        else
            System.out.println("Banana");
        System.out.println("Grape");
        if (q < 0) {
            System.out.println("Blueberry");
            System.out.println("Kiwi");
        }
        else if (q !=2)
            System.out.println("Cantaloupe");
        else if (q<3)
            System.out.println("Watermelon");
        else
            System.out.println("Mango");
        if (q == 2 || q > -2)
            System.out.println("Strawberry");
        System.out.println("Cherry");
    }
    public static int mystery(int x) {
        int z = 0;
        for (int i = 1; i <=x; i++)
            z += i;
        return z;
    }
    public static void preAndPost(int x) {
        if (x < 3) System.out.print(x);
        else System.out.print(++x);
        if (x < 2) System.out.print(x);
        else System.out.print(x++);
        if (x < 1) System.out.print(x);
        else System.out.print(++x);
        if (x < 0) System.out.print(x);
        else System.out.print(x++);
        System.out.print(x);
    }
    public static void doMath() {
        int a = -8/5;
        int b = 9/4 ;
        double c = 5/2.0 ;
        System.out.println(a+b+c);
    }
}
