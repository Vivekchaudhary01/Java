import java.util.Scanner;

public class StoreNPallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i=1,j=0,count=0;
        while(i<n*100){
            if(isPallindrome(i)){
                a[j++]=i;
                count++;
            }
            if(count==n)
                break;
            i++;
        }
        for(int k:a)
            System.out.print(k+" ");
    }    
    public static boolean isPallindrome(int n){
        if(n/10==0)
            return true;
        String s=Integer.toString(n);
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
