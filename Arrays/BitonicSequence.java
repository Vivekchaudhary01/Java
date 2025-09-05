// Given a bitonic sequence of n distinct elements, and an integer x. WAJP to find given element index  in the bitonic sequence in O(log n) time. 
// A Bitonic Sequence is a sequence of numbers that is first strictly increasing then after a point decreasing.
// Input :  arr[] = {8 ,12 18, 20, 17, 5, 1}, key = 20
//Output : Found at index 3
// Input :  arr[] = {5, 6, 7, 8, 9, 10, 3, 2, 1}, key = 30
//Output : Not Found

import java.util.Scanner;

import java.util.Scanner;

public class BitonicSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {8, 12, 18, 20, 17, 5, 1};
        printArray(arr);
        System.out.println("Enter the value to search:");
        int key = sc.nextInt();

        int index = searchBitonic(arr, key);
        if (index != -1)
            System.out.println("Found at index " + index);
        else
            System.out.println("Not Found");
    }

    public static int searchBitonic(int[] arr, int key) {
        int peak = findPeak(arr);
        int index = binarySearch(arr, 0, peak, key);
        if (index != -1)
            return index;
        return binarySearch(arr, peak + 1, arr.length - 1, key);
    }
    public static int findPeak(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < arr[mid + 1])
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
    public static int binarySearch(int[] arr, int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    public static void printArray(int[] nums) {
        for (int i : nums)
            System.out.print(i + " ");
        System.out.println();
    }
}

