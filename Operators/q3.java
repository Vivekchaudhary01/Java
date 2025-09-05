// WAJP to swap two numbers.



public class q3 {
    public static void main(String[] args) {

        
        int a = 10,b=20,temp;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // a. With using a third variable
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        System.out.println("---------------------------------");

        // b. Without using third variable
        a = 10;
        b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a=a+b-(b=a);
        // a = a + b;
        // b = a - b;
        // a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}
