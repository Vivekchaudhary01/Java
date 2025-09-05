//WAJP to take CP and SP from user and print %Profit or % Loss in the transaction.
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the CP:");
        int cp=sc.nextInt();
        System.out.print("Enter the SP:");
        int sp=sc.nextInt();
        int profit=sp-cp;
        int loss=cp-sp;
        if (profit > 0) {
            double percentProfit = (profit / (double) cp) * 100;
            System.out.println("Profit Percentage: " + percentProfit + "%");
        } else if (loss > 0) {
            double percentLoss = (loss / (double) cp) * 100;
            System.out.println("Loss Percentage: " + percentLoss + "%");
        } else {
            System.out.println("No Profit No Loss");
        }
        sc.close();
    }
}
