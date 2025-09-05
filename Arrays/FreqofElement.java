public class FreqofElement {
    public static void main(String[] args) {
        int a[]={1,2,3,12,1,3,2,4,5,6,2,5};
        System.out.println("Original Array a: ");
        printArray(a);
        freqOfElements(a);        
    }
    public static void freqOfElements(int arr[]){
        int max=arr[0],min=arr[0];
        for(int x:arr){
            if(x>max) max=x;
            if(x<min) min=x;
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<arr.length;i++)
            freq[arr[i]-min]++;

        // printing Frequency
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0)
            System.out.println(i+min+" => "+freq[i]);
        }
    }
    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }    
}
