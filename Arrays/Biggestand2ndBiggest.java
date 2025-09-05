import javax.print.DocFlavor.INPUT_STREAM;

public class Biggestand2ndBiggest {
    public static void main(String[] args) {
        int a[]={80,80,43,50,38,63,58,80};
        System.out.println("Original array: ");
        printArray(a);
        Biggestand2ndBiggest(a);
    }
    public static void Biggestand2ndBiggest(int a[]){
        int max=Integer.MIN_VALUE,Secondmax=Integer.MIN_VALUE;
        for(int i:a){
            if(i>max)
                max=i;
            if(i>Secondmax&&i<max)
                Secondmax=i;
        }
        System.out.println(max+","+Secondmax);
    }
    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }
}
