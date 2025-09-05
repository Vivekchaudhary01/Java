public class SmallestELeandMaxFreq {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4};
        System.out.println("Original Array: ");
        printArray(a);
        SmallestELeandMaxFreq(a);
    }

    public static void SmallestELeandMaxFreq(int[] a){
        int max=a[0],min=a[0];
        for(int x:a){
            if(x>max) max=x;
            if(x<min) min=x;
        }
        
        int[] freq=new int[max-min+1];
        
        for(int i=0;i<a.length;i++)
            freq[a[i]-min]++;
        int elemax=Integer.MIN_VALUE,ele=0;
        for(int i=freq.length-1;i>=0;i--){
            if(freq[i]!=0&&freq[i]>=elemax){
                elemax=freq[i];
                ele=i+min;
            }
        }
        System.out.println(ele+"=>"+elemax+" ");
    }
    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }
}
