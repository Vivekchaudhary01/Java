// WAJP to store the binary values of a number in List.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        List<Integer> binary = getBinaryDigits(number);

        System.out.println("Binary digits: " + binary);
    }    
    public static List<Integer> getBinaryDigits(int n){
        List<Integer> binary=new ArrayList<>();
        if(n==0){
            binary.add(0);
            return binary;
        }
        while(n>0){
            binary.add(n%2);
            n/=2;
        }

        Collections.reverse(binary);    
        
        return binary;
    }
}
