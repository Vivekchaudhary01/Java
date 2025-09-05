public class allElementsUnique {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array a: ");
        printArray(a);
        System.out.println(checkUniqueElements(a));
    }
    public static boolean checkUniqueElements(int nums[]){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int x:nums){
            if(x>max)   max=x;
            if(x<min)   min=x;
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<nums.length;i++)
            freq[nums[i]-min]++;

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0&&freq[i]>1)
                return false;
        }
        return true;
    }
    public static void printArray(int nums[]){
        for(int i:nums) 
            System.out.print(i+" ");
        System.out.println();
    }
}
