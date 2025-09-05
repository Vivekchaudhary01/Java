//WAJP to find the real roots of a quadratic equation.

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Quadratic Equation: ax^2+bx+c\nEnter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        System.out.print("Enter the value of c:");
        int c=sc.nextInt();
        double d=b*b-4*a*c; 
        if(d>0){
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots are real and distinct\nRoot 1: "+r1+"\nRoot 2: "+r2);
        }
        else if(d==0){
            double r1=(-b)/(2*a);
            System.out.println("The roots are real and equal\nRoot 1: "+r1+"\nRoot 2: "+r1);
        }
        else{
            double realPart=(-b)/(2*a);
            double imaginaryPart=Math.sqrt(-d)/(2*a);
            System.out.println("The roots are imaginary\nRoot 1: "+realPart+"+"+imaginaryPart+"i\nRoot 2: "+realPart+"-"+imaginaryPart+"i");
        }
        sc.close();
    }
}
