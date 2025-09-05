// WAJP to print and count all the Strong numbers up to 100.

public class stronginrange {
    public static void main(String[] args) {
        int i=1,sum,count = 0, temp;
        while (i<=100) {
            sum = 0;
            temp=i;
            while (temp != 0) {
                sum += factorial(temp%10);
                temp /= 10;
            }
            if (sum == i) {
                count++;
                System.out.print(i+ " ");
            }
            i++;     
        }
        System.out.print("\n Count is :"+count);
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }   
        
}
