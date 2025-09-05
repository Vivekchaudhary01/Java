import java.util.Scanner;

public class EvenStringLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        String[] a=new String[n];
        System.out.println("Enter the Elements of Array: ");
        for(int i=0;i<n;i++)
            a[i]=sc.next();
        printEvenStringLength(a);
    }
    public static void printEvenStringLength(String[] a){
        int count=0;
        for(String i:a){
            if(i.length()%2==0){
                count++;
                System.out.print(i+" ");
            } 
        }
        System.out.println("\n Total even characters in Array is: "+count);
    }
}
