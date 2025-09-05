// For the given three numbers. Swap 1st into 2nd, 2nd into 3rd and 3rd into 1st  number.

public class q4 {
    public static void main(String[] args) {
        int a=10, b=20, c=30, temp;
        // With using fourth variable
        System.out.println("Before swapping: a = " + a + ", b = " + b + ", c = " + c);
        temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("---------------------------------");

        // Without using fourth variable
        a = 10;
        b = 20;
        c = 30;
        System.out.println("Before swapping: a = " + a + ", b = " + b + ", c = " + c);
        a = a + b + c;
        b = a - (b + c);
        c = a - (b + c);
        a = a - (b + c);
        System.out.println("After swapping: a = " + a + ", b = " + b + ", c = " + c);
    }
}
