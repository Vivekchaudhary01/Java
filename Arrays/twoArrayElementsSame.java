public class twoArrayElementsSame {
    public static void main(String[] args) {
        int a[]={1,2,3,4,7};
        int b[]={4,3,5,2,1};
        printArray(a);
        printArray(b);
        System.out.println(twoArrayElementsSame(a,b));        
    }
    public static boolean twoArrayElementsSame(int a[],int b[]){
        int i=0,j,an=a.length,bn=b.length;
        while(i<an){
            int count=0;
            for(j=0;j<bn;j++){
                if(a[i]==b[j])
                    count++;
            }
            if(count==0)
                return false;
            i++;
        }
        return true;
    }
    public static void printArray(int n[]){
        for(int i:n)
            System.out.print(i+" ");
        System.out.println();
    }

}
