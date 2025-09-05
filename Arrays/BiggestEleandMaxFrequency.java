
public class BiggestEleandMaxFrequency {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4};
        System.out.println("Original Array: ");
        printArray(a);
        BiggestELeandMaxFreq(a);
    }   
    public static void BiggestELeandMaxFreq(int a[]){
        int max=a[0],min=a[0];
        for(int x:a){
            if(x<min)   min=x;
            if(x>max)   max=x;
        }
        int freq[]=new int[max-min+1];

        for(int i=0;i<a.length;i++)
            freq[a[i]-min]++;
        max=0;
        int ele=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0&&freq[i]>=max){
                max=freq[i];
                ele=i+min;
            }
        }
        System.out.println(ele+"=>"+max);
    }
    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    } 
}
