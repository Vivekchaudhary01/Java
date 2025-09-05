import java.util.*;

public class Q47 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int N = 6;

        List<Integer> missing = findMissingNumbers(arr, N);

        System.out.println("Missing numbers: " + missing);
    }
    public static List<Integer> findMissingNumbers(int arr[],int n){
        Set<Integer> present=new HashSet<>();
        for(int i:arr){
            present.add(i);
        }
        List<Integer> missing=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!present.contains(i))
                missing.add(i);
        }

        return missing;
    }    
}
