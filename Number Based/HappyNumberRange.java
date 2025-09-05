public class HappyNumberRange {
    public static void main(String[] args) {
        System.out.println("Happy Number upto 100 are: ");
        int count=0;
        for(int i=1;i<=100;i++){
            if(HappyNumber(i)){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nTotal Happy Number upto 100 are: "+count);
        
    }
    public static boolean HappyNumber(int n){
        while(n>9){
            int sum=0;
            while(n>0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            n=sum;
        }
        return n==1||n==7;
    }
}
