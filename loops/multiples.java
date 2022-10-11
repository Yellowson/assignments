package loops;

public class multiples {
    public static void main(String... args) {

        System.out.println("Multiplication table for 2,3,4,200 and 2,000,000,000");
        byte small = 2;
        byte small3 = 3;
        byte small4 = 4;
        short nope = 200;
        int bigNo = 2_000_000_000;

        System.out.println("  Multiply Table 2*1 to 10 using Loop ");
        for (int i = 1; i <=10; i = i+1)
        System.out.println(" result = " + small * i);
        for (int i = 1; i <=10; i = i+1)
            System.out.println("result =" + small3 * i);
        for (int i = 1; i <=10; i = i+1)
            System.out.println("result =" + small4 * i);
    }
}

