// WAJP to print all the duplicate elements in a Array.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        printDuplicateElements(arr);
    }
    public static void printDuplicateElements(int arr[]){
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int i:arr){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }

        System.out.println("Duplicate Elements are:");
        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            if(entry.getValue()>1)
                System.out.println(entry.getKey());
        }
    }
}
