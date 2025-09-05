import java.util.ArrayList;
import java.util.List;

public class Q48 {
    public static void main(String[] args){
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> missingNumbers = findDisappearedNumbers(nums);

        System.out.println("Missing numbers: " + missingNumbers);
    }   
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] numbers = new int[nums.length + 1];

        for (int num : nums) {
            numbers[num]++;
        }
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                result.add(i);
            }
        }

        return result;
    } 
}
