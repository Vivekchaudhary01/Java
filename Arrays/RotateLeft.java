public class RotateLeft {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70};
        System.out.println("Original Array: ");
        printArray(a);
        System.out.println();
        leftRotate(a);
        System.out.println("Left Rotate Array: ");
        printArray(a);
    }
    public static void leftRotate(int a[]){
        int n=a.length;
        reverse(a,0,n-1);
    }
    public static void reverse(int a[],int start, int end){
        int temp;
        while(start<end){
            temp=a[start];
            a[start]=a[start+1];
            a[start+1]=temp;
            start++;
        }
    }
    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i+" ");
    }
}
