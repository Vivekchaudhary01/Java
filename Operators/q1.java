// For a given number int n=5783;
// a. Print the last digit of the number
// b. Print the last two digit of the number
// c. Remove the last digit of the number
// d. Remove the last two digit of the number

public class q1 {
    public static void main(String[] args) {
        int n=5783;
        System.out.println(n);
        System.out.println("Last digit of the number: "+n%10);
        System.out.println("Last two digit of the number: "+n%100);
        System.out.println("Remove last digit of the number: "+n/10);
        System.out.println("Remove last two digit of the number: "+n/100);
    }
}
