public class MaximumProduct {
    public static void main(String[] args) {
        int a[]={18,22,15,10,23,25,20};
        int b[]={19,40,15,25,23,25,20};
        System.out.println("Original Array a: ");
        printArray(a);
        MaximumProduct(a);
        System.out.println("Original Array b: ");
        printArray(b);
        MaximumProduct(b);
    }
    public static void MaximumProduct(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]*arr[j]>max)
                    max=arr[i]*arr[j];
            }
        }
        System.out.println(max);
    }
    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }
}
