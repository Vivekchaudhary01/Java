import java.util.*;

public class Q56 {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to be stored in queue:");
        String input = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        for (char ch : input.toCharArray()) {
            queue.offer(ch);
        }

        System.out.println("Queue elements: " + queue);

        if (isPalindrome(queue)) {
            System.out.println("The queue represents a palindrome.");
        } else {
            System.out.println("The queue does NOT represent a palindrome.");
        }
        sc.close();
    }    
        public static boolean isPalindrome(Queue<Character> queue) {
        List<Character> list = new ArrayList<>(queue); 
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
