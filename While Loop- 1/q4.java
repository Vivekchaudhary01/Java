//WAJP to print all the odd numbers from 1 to 100.

public class q4 {
    public static void main(String[] args) {
        int n=1;
        System.out.println("all the odd numbers from 1 to 100 are: ");
        while (n<=100) {
            if(n%2!=0)
                System.out.print(n+" ");
            n++;
        }
    }
}
