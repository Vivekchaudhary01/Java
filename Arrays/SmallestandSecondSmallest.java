public class SmallestandSecondSmallest {
    public static void main(String[] args) {
        int a[]={80,80,43,50,38,63,58,80};
        System.out.println("Original Array: ");
        printArray(a);
        SmallestandSecondSmallest(a);
    }
    public static void SmallestandSecondSmallest(int a[]){
        int max=a[0],min=a[0];
        for(int x:a){
            if(x>max)
                max=x;
            if(x<min)
                min=x;
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<a.length;i++)
            freq[a[i]-min]++;

        int SecondSmallest=Integer.MAX_VALUE;
        for(int i=1;i<freq.length;i++)
        if(freq[i]!=0){
            SecondSmallest=i+min;
            break;
        }

        System.out.println(min+"  "+SecondSmallest);
    }
    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }
}
