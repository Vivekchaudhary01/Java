//   E D C B A 
//     I H G F 
//       L K J 
//         N M 
//           O 

import java.util.Scanner;
public class InvertedAndReverseAplhabetsE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        printInvertedAplhabets(n);
    }
    public static void printInvertedAplhabets(int n) {
        char ch = 'A',ch1;int star=n,space=0;
        ch+=star-1;
        for (int i = 1; i <= n; i++) {
            for(int k=1;k<=space;k++)
                System.out.print("  ");
            ch1=ch;
            for(int j=1;j<=star;j++){
                System.out.print(ch--+ " ");
            }
            
            star--;
            ch=(char)(ch1+star);
            space++;
            System.out.println();
        }
    }
}
