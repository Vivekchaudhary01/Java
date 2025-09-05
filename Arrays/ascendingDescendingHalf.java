public class ascendingDescendingHalf {
    public static void main(String[] args) {
        int nums[]={25,34,12,45,23,28};
        printArray(nums);
        BubbleSort(nums);
        ascendingDescendingHalf(nums);
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
    public static void ascendingDescendingHalf(int nums[]){
        int mid=nums.length/2,temp;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(j<mid){
                    if(nums[j]>nums[j+1]){
                        temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
                else{
                    if(nums[j]<nums[j+1]){
                        temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
            }
        }
    }
    public static void printArray(int nums[]){
        for(int i:nums)
            System.out.print(i+" ");
        System.out.println();
    }
}
