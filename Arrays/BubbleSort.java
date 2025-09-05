public class BubbleSort {
    public static void main(String[] args) {
        int nums[]={1,4,2,7,5,6};
        printArray(nums);
        BubbleSort(nums);
        System.out.println("After Sort:");
        printArray(nums);
    }
    public static void BubbleSort(int nums[]){
        int n=nums.length,temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int nums[]){
        for(int x:nums)
            System.out.print(x+" ");
        System.out.println();
    }
}
