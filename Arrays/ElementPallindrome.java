public class ElementPallindrome {
    public static void main(String[] args) {
        int[] a={2,3,4,6,23,252,121};
        printPallindromeElement(a);
    }
    public static void printPallindromeElement(int[] a){
        int count=0;
        for(int i:a){
            if(isPallindrome(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.print("\nTotal pallindrome elements are: "+count);
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
