public class OnceAppear {
    public static void main(String[] args) {
        int a[]={1,2,3,1,3,4,5,6,7};
        int result=0;
        for(int i:a)    
            result^=i;

        System.out.println("Element that appears only once: " + result);
    }
}
/*
Output:
Element that appears only once: 2
*/