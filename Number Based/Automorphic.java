// Automorphic Number: 
// A number is called automorphic if its square ends with the same digits as the number itself.
// Example: 5*5=25, 6*6=36, 25*25=625, 76*76=5776, 625*625=390625

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        if(isAutomorphic(n)){
            System.out.println(n+" is an Automorphic Number");
        }
        else
            System.out.println(n+" is not an Automorphic Number.");
    }
    public static boolean isAutomorphic(int n){
        int square=n*n;
        return (square%10==n%10);
    }    
}
