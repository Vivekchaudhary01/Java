import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        Scanner sc=new Scanner(System.in);
        printArray(nums);
        System.out.println("Enter the Element to Search:");
        int k=sc.nextInt();
        System.out.println(LinearSearch(nums,k));
    }
    public static int LinearSearch(int nums[],int k){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                return i+1;
            }
        }
        return -1;
    }
    public static void printArray(int nums[]){
        for(int i:nums)
            System.out.print(i+" ");
        System.out.println();
    }
}
