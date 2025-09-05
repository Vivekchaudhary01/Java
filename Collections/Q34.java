import java.util.*;

public class Q34 {
    public static void main(String[] args) {
        System.out.println(getRow(3));  // Output: [1, 3, 3, 1]
        System.out.println(getRow(0));  // Output: [1]
        System.out.println(getRow(1));  // Output: [1, 1]
    }
    public static List<Integer> getRow(int rowIdx){
        List<Integer> row=new ArrayList<>();
        row.add(1);
        for(int i=1;i<=rowIdx;i++){
            for(int j=row.size()-1;j>=1;j--)
                row.set(j,row.get(j)+row.get(j-1));
            row.add(1);
        }
        return row;
    }
}
