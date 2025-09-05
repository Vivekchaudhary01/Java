import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={80,80,43,50,38,63,58,80};
        System.out.println("Original array: ");
        printArray(a);
        System.out.println("Enter value of k:");
        int k=sc.nextInt();
        KthLargestElement(a,k);
    }

    public static void KthLargestElement(int a[],int k){
        int max=a[0],min=a[0];
        for(int x:a){
            if(x>max)
                max=x;
            if(x<min)
                min=x;
        }

        int freq[]=new int[max-min+1];
        // Insert elments in freq array
        for (int i = 0; i < a.length; i++) {
            freq[a[i] - min]++;
        }          

        int count=0,KthMAX=Integer.MIN_VALUE;

        for (int i = freq.length - 1; i >= 0; i--) {
            // coun+=freq[i]; if non distinct elements are present
            if (freq[i] != 0) {
                count++;
                if(count==k){
                    KthMAX=i+min;
                    break; 
                }
            }
        }
        System.out.println(KthMAX);
    }
    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }
}
