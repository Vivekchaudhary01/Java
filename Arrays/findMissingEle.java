// WAJP find missing element from a given array which has a missing element in a range of n.
// N=7
// i/p: [7, 4,3, 0, 5, 1, 6]
// o/p: 2

import java.util.Scanner;

public class findMissingEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the n:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        findMissingEle( n, arr);
    }
    public static void findMissingEle(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i<n; i++) {
            sum += arr[i];
        }
        int totalSum = n * (n + 1) / 2;
        int missingElement = totalSum - sum;
        System.out.println("The missing element is: " + missingElement);
    }
        
}
