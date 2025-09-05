public class SumPrimeElement {
    public static void main(String[] args) {
        int[] a={2,3,4,6,23,52};
        printPrimeElement(a);
    }
    public static void printPrimeElement(int[] a){
        int sum=0;
        for(int i:a){
            if(isPrime(i)){
                sum+=i;
            }
        }
        System.out.print("Sum of prime elements are: "+sum);
    }
    public static boolean isPrime(int n){
        if(n<2)
            return false;
        if(n==2||n==3)
            return true;
        if(n%2==0)
            return false;
        for(int i=3;n>=i*i;i+=2){
            if(n%i==0)
                return false;
        }
        return true;
    }    
}
