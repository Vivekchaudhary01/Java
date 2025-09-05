// Given an Array of integers, write a program to find the first non-repeating element.

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q80 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        printFirstNonRepeatingElement(arr);
        sc.close();
    }
    public static void printFirstNonRepeatingElement(int arr[]){
        Map<Integer,Integer> freqMap=new LinkedHashMap<>();
        for(int i:arr){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }

        System.out.println("First Non-Repeating Element is:");

        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;    
            }     
        }    
    }    
}
