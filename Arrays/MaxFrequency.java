public class MaxFrequency {
    public static void main(String[] args) {
        int a[]={1,1,2,3,4,5,6,5,5,4,7};
        System.out.println("Original Array a: ");
        printArray(a,a.length);
        UniqueElements(a);             
    }
    public static void UniqueElements(int arr[]){
        int max=arr[0],min=arr[0];

        for(int x:arr){
            if(x>max) max=x;
            if(x<min) min=x;
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<arr.length;i++)
            freq[arr[i]-min]++;
        System.out.println("Duplicate Elements in array:");
        max=0;
        int ele=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0&&freq[i]>max) {
                max = freq[i];
                ele = i + min;
            }
        }
        System.out.print(ele+"=>"+max+" ");
    }
    public static void printArray(int a[],int size){
        for(int i=0;i<size;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }      
}
