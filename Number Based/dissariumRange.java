// WAJP to print and count all the dissarium numbers up to 1000.


public class dissariumRange {
    public static void main(String[] args) {
        int n=1,count=0;
        while (n<=1000) {
            if (isDissarium(n)) {
                System.out.print(n+" ");
                count++;
            }
            n++;
        }
        System.out.println("\nTotal Count of Dissarium number is: "+count);
    }    
    
    public static boolean isDissarium(int n){
        int temp=n,sum=0,i=0;
        int length=String.valueOf(n).length();
        while (temp!=0) {
            sum+=Math.pow(temp%10, length-i);
            temp/=10;
            i++;
        }
        return sum==n;
    }
}
