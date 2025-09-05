// WAJP to check if an array is strictly increasing.
// i/p: [2, 3, 7, 8, 9]
// o/p: Array is strictly increasing
public class StrictlyIncreasing {
    public static void main(String[] args) {
        int arr[]={2,3,7,8,9};
        if(isStrictlyIncreasing(arr))
            System.out.println("Array is strictly increasing.");
        else
            System.out.println("Array is not strictly increasing.");
    }
    public static boolean isStrictlyIncreasing(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }
}
