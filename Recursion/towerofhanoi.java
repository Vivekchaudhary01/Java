import java.util.Scanner;

public class towerofhanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks:");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Number of disks must be a positive integer.");
            return;
        }
        sc.close();
        while (n != 4) {
            System.out.println("Please enter exactly 4 disks:");
            n = sc.nextInt();
        }
        System.out.println("Steps to solve Tower of Hanoi with " + n + " disks:");
        solveTowerOfHanoi(n, 'A', 'B', 'C');
    }    
    public static void solveTowerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        solveTowerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solveTowerOfHanoi(n - 1, auxiliary, source, destination);
    }

}
