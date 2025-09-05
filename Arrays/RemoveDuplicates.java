public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[]={1,1,2,3,4,5,6,5,4,7};
        System.out.println("Original Array a: ");
        printArray(a,a.length);
        a=RemoveDuplicates(a);; 
        int count=0,size=a.length;
        for(int x:a)
            if(x==0)
                count++;
        printArray(a,size-count);             
    }
    public static int[] RemoveDuplicates(int arr[]){
        int max=arr[0],min=arr[0];
        int b[]=new int[arr.length];

        for(int x:arr){
            if(x>max) max=x;
            if(x<min) min=x;
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<arr.length;i++)
            freq[arr[i]-min]++;

        int j=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0)
                b[j++]=i+min;
        }
        
        return b;
    }
    public static void printArray(int a[],int size){
        for(int i=0;i<size;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }  
//     import java.util.*;

// public class RemoveDuplicates {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 2, 4, 3, 5, 5};

//         Set<Integer> set = new LinkedHashSet<>();
//         for (int num : arr) {
//             set.add(num);
//         }

//         System.out.println("Array after removing duplicates: " + set);
//     }
// }
    
}
