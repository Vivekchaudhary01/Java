import java.util.Scanner;

public class rotateKPostion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7};
        System.out.println("Original Array: ");
        printArray(a);
        System.out.println("\nEnter the numbers u want to rotate: ");
        int k=sc.nextInt();
        rotate(a,k);
        System.out.println("Rotated Array: ");
        printArray(a);
    }

    public static void  rotate(int[]nums,int k){
        int n=nums.length;
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    private static void reverse(int[]nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int a[]){
        for(int n:a)
            System.out.print(n+" ");
    }    
}
