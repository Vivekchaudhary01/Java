// WAJP to print the element in a Array with highest Frequency.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q73 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        printHighestFrequencyElement(arr);
    }
    public static void printHighestFrequencyElement(int arr[]){
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int i:arr){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }

        System.out.println("HighestFrequencyElement is:");
        int maxFreq=0;
        int maxFreqElement=arr[0];

        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                maxFreqElement=entry.getKey();
            }
                
        }    
        System.out.println(maxFreqElement);    
    }
}
