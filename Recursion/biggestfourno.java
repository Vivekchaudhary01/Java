import java.util.Scanner;

public class biggestfourno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        System.out.println("Biggest number is: "+biggest(a,b,c,d));
    }
    public static int biggest(int a,int b,int c,int d){
        if (a >= b && a >= c && a >= d) {
            return a;
        }
        return biggest(b, c, d, a > b && a > c && a > d ? a : d);
    }
}
