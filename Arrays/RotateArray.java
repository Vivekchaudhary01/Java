public class RotateArray {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70};
        System.out.println("Original Array: ");
        printArray(a);
        rotateArray(a);
        System.out.println("\nRotated Array: ");
        printArray(a);
    }
    public static void rotateArray(int a[]){
        a[a.length-1]=a[0]+a[a.length-1]-(a[0]=a[a.length-1]);
        for(int i=a.length-1;i>1;i--){
            a[i]=a[i-1]+a[i]-(a[i-1]=a[i]);
        }
    }
    public static void printArray(int a[]){
        for(int n:a)
            System.out.print(n+" ");
    }
}
