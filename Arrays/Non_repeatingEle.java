public class Non_repeatingEle {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 3, 5, 1, 3, 4, 4, 4, 4};
        System.out.println("Original Array: ");
        printArray(a);
        int index=non_repeatingEle(a);
        System.out.println(index);
    }  
    public static int non_repeatingEle(int a[]){
        int max=a[0],min=a[0];
        for(int x:a){
            if(x>max)   max=x;
            if(x<min)   min=x;
        }

        int freq[]=new int[max-min+1];
        for(int i=0;i<a.length;i++)
            freq[a[i]-min]++;
    
        for(int i=0;i<a.length;i++){
            if(freq[a[i]-min]==1){
                return i;
            }
        }
        return -1;
    }
    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    } 
}
