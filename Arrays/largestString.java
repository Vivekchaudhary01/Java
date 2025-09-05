public class largestString {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "elderberry"};
        String largest = findLargestString(arr);
        System.out.println("The largest string is: " + largest);
    }
    public static String findLargestString(String[] arr) {
        String largest = arr[0];
        for (String str : arr) {
            if (str.length() > largest.length()) {
                largest = str;
            }
        }
        return largest;
    }
}
