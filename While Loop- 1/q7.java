//WAJP to print and count all the numbers from 1 to 1000  which are divisible by 7 and also ends with 7.

public class q7 {
    public static void main(String[] args) {
        int n=1,count=0;
        while (n<=1000) {
            if(n%7==0 && n%10==7){
                System.out.print(n+" ");
                count++;
            }
            n++;
        }
        System.out.println();
        System.out.println("count all the numbers from 1 to 100  which are divisible by 7 and ends with 7 is: "+count);
    }    
}
