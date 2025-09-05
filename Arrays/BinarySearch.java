import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        Scanner sc=new Scanner(System.in);
        printArray(nums);
        System.out.println("Enter the Element to Search:");
        int k=sc.nextInt();
        System.out.println(BinarySearch(nums,k));
    }
    public static int BinarySearch(int nums[],int k){
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == k)
                return mid+1;
            else if (nums[mid] < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    public static void printArray(int nums[]){
        for(int i:nums)
            System.out.print(i+" ");
        System.out.println();
    }    
}
