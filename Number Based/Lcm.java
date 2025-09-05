import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three number: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println("LCM of "+a+","+b+","+c+" is: "+LCM(a,b,c));
    }
    public static int LCM(int a,int b,int c){
        int n=a>b&&a>c?a:(b>c?b:c);
        for(int i=n;;i++) {
            if(i % a == 0 && i % b == 0 && i % c == 0)
                return i;
        }
    }
}
