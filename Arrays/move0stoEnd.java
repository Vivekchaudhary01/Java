// WAJP to move all zeroes of an array to the end.
// i/p: [7, 0, 2, 6, 0, 4]
// o/p: [7, 2, 6, 4, 0, 0]

public class move0stoEnd {
    public static void main(String[] args) {
        int arr[]={7, 0, 2, 6, 0, 4};
        move0stoEnd(arr);
        for(int i:arr)
            System.out.print(i+" ,");
    }
    
    public static void move0stoEnd(int arr[]){
        int n=arr.length,temp;
        
        for(int i=0,j=0;i<n;i++){
            if(arr[i]!=0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        
    }
}
