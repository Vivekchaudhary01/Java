public class MergeArray {
    public static void main(String[] args) {
        int [] arr1={1,3,5};
        int [] arr2={2,4,6,8,10};
        int n=arr1.length+arr2.length;
        int [] arr3=new int[n];
        mergeArray(arr1, arr2, arr3);
        System.out.print("Merged Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
    public static void mergeArray(int[] arr1, int[] arr2, int[] arr3) {
        int i=0,j=0,k=0;
        while(i<arr1.length) {
            arr3[k++] = arr1[i++];
        }
        while(j<arr2.length) {
            arr3[k++] = arr2[j++];
        }
        // Sorting the merged array
        for (int m = 0; m < arr3.length - 1; m++) {
            for (int n = m + 1; n < arr3.length; n++) {
                if (arr3[m] > arr3[n]) {
                    // Swap arr3[m] and arr3[n]
                    int temp = arr3[m];
                    arr3[m] = arr3[n];
                    arr3[n] = temp;
                }
            }
        }
    }
}
