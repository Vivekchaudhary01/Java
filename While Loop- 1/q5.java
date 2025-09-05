//WAJP to print and count all the numbers from 1 to 100  which are divisible by 7.

public class q5 {
    public static void main(String[] args) {
        int n=1,count=0;
        while (n<=100) {
            if(n%7==0){
                System.out.print(n+" ");
                count++;
            }
            n++;
        }
        System.out.println();
        System.out.println("count all the numbers from 1 to 100  which are divisible by 7 is: "+count);
    }    
}
