// WAJP to print factorial and ask user in end to press Y/y to continue or any other key to exit.


import java.math.BigInteger;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        do{
            System.out.println("Enter the Number : ");
            int n=sc.nextInt();
            
            int f=1;
            while(n>0){
                f*=n;
                n--;
            }
            System.err.println(f+" is the Factorial.");
            System.out.println("Do you Want to continue: ");
            ch=sc.next().charAt(0);

        }while(ch=='Y'||ch=='y');
    }    
}


// for big Integer
// import java.math.BigInteger;
// import java.util.Scanner;

// public class FactorialCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         char ch;
//         do {
//             System.out.println("Enter a number: ");
//             int n = sc.nextInt();
            
//             BigInteger f = BigInteger.ONE;
//             for (int i = 1; i <= n; i++) {
//                 f = f.multiply(BigInteger.valueOf(i));
//             }
//             System.out.println(f + " is the factorial.");
            
//             System.out.println("Do you want to continue? (Y/y to continue, any other key to exit): ");
//             ch = sc.next().charAt(0);

//         } while (ch == 'Y' || ch == 'y');

//         sc.close();
//     }
// }