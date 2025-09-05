import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generatePascal(numRows);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }    
    public static List<List<Integer>> generatePascal(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row= new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                    row.add(1);
                else{
                    int val=triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j);
                    row.add(val);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}
