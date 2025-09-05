public class shift0and1 {
    public static void main(String[] args) {
        int[] a={0,1,1,0,0,1,0,1,0};
        left0right1(a);

        for(int nums:a)
        {
            System.out.print(nums +" ");
        }
    }
    public static void left0right1(int [] a)
    {   int count0=0;
        for(int num:a)
            { if(num==0)
                count0++;
            }

        for(int i=0;i<count0;i++)
            a[i]=0;

        for (int i = count0; i < a.length; i++) 
            a[i] = 1;
    }
}
