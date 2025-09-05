// Automorphic Number: 
// A number is called automorphic if its square ends with the same digits as the number itself.
// Example: 5*5=25, 6*6=36, 25*25=625, 76*76=5776, 625*625=390625

public class AutomorphicRange {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Automorphic Numbers upto 100 are: ");
        for(int i=1;i<=100;i++){
            if(isAutomorphic(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.print("\nTotal Aautomorphic Numbers are: "+count);
    }
    public static boolean isAutomorphic(int n){
        int square=n*n;
        return (square%10==n%10);
    }    
}
