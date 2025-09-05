// WAJP to print true if elements of an array are same when it is read from front or from back otherwise print false.
// i/p: [12, 23, 15, 15, 23, 12]
// o/p: true

public class sameElements {
    public static void main(String[] args) {
        int[] arr = {12, 23, 15, 15, 23, 12};
        boolean isSame = true;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isSame = false;
                break;
            }
        }
        System.out.println(isSame);
    }
}
