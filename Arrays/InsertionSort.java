public class InsertionSort {
    public static void main(String[] args) {
        int nums[]={1,4,2,7,5,6};
        printArray(nums);
        InsertionSort(nums);
        System.out.println("After Sort:");
        printArray(nums);
    }
    public static void InsertionSort(int nums[]){
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i]; 
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }

    public static void printArray(int nums[]){
        for(int x:nums)
            System.out.print(x+" ");
        System.out.println();
    }    
}
