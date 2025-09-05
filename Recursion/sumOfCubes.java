// WAJP to print sum of cubes of numbers from 1 to 100 by using recursion.

import java.util.Scanner;
public class sumOfCubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. for upto: ");
        int n=sc.nextInt();
        System.out.println("Sum is: "+sumOfCubes(n));
    }
    public static int sumOfCubes(int n){
        if(n==1)
            return 1;
        else
            return n*n*n+sumOfCubes(n-1);
    }
}
