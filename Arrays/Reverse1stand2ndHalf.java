public class Reverse1stand2ndHalf {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60,70};
        System.out.println("Original Array:");
        printArray(a);
        reverseFirstAndSecondHalf(a);
    }
    public static void reverseFirstAndSecondHalf(int[] arr) {
        int n = arr.length;
        int mid = n / 2;
        int j=mid,i=0;
        while(i<j) {
            arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
            j--;
            i++;
        }
        int k=mid+1;
        while(k<n) {
            arr[k]=arr[k]+arr[n-1]-(arr[n-1]=arr[k]);
            k++;
            n--;
        }
        System.out.println("Array after reversing first and second half:");
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
