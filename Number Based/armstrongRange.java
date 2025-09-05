import java.util.Scanner;

public class armstrongRange {
    public static void main(String[] args) {
        int n=1,count=0;
        while(n<=1000){
            if (isArmstrong(n)) {
                System.out.print(n+" ");
                count++;
            }
            n++;
        }
        System.out.println("\nTotal Armstrongs are: "+count);
     
    }
    
    public static boolean isArmstrong(int n){
        int temp=n,sum=0;
        while (temp!=0) {
            sum+=Math.pow(temp%10,3);
            temp/=10;
        }
        return sum==n;
    }    
}
