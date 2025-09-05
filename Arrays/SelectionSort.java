public class SelectionSort {
    public static void main(String[] args) {
        int nums[]={1,4,2,7,5,6};
        printArray(nums);
        SelectionSort(nums);
        System.out.println("After Sort:");
        printArray(nums);
    }
    public static void SelectionSort(int nums[]){
        int n=nums.length,temp,min=0;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[min])
                    min=j;
            }
            if(min!=i){
                temp=nums[min];
                nums[min]=nums[i];
                nums[i]=temp;
            }
        }
    }
    public static void printArray(int nums[]){
        for(int x:nums)
            System.out.print(x+" ");
        System.out.println();
    }
}
