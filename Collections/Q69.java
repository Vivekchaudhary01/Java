// WAJP to print all the unique elements in a Array.

import java.util.*;

public class Q69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printUniqueElements(arr);   
        
        sc.close();     
    }
    public static void printUniqueElements(int arr[]){
        Map<Integer,Integer> freqMap=new HashMap<>();

        for(int n:arr){
            freqMap.put(n,freqMap.getOrDefault(n,0)+1);
        }

        System.out.println("Element : Frequency");
        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            if(entry.getValue()==1)
                System.out.println(entry.getKey());
        }
    }    
}
