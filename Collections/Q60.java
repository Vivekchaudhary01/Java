// Write a Java program to Find the Biggest and second Biggest 
// elements of array.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of Array: ");
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++)
            queue.add(sc.nextInt());
        
        findBiggestAndSecondBiggest(queue);
    }
    public static void findBiggestAndSecondBiggest(Queue<Integer> queue){
        int biggest=Integer.MIN_VALUE;
        int secondBiggest=Integer.MIN_VALUE;

        for(int ele: queue){
            if(ele>biggest){
                secondBiggest=biggest;
                biggest=ele;
            }
            else{
                if(ele!=biggest && ele>secondBiggest)
                    secondBiggest=ele;
            }
        }

        System.out.println("Biggest is: "+biggest+" Second Biggest: "+secondBiggest);
    }
}
