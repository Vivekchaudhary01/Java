// https://leetcode.com/problems/triangle/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q33 {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        System.out.println(minimumTotal(triangle));
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                int current=triangle.get(i).get(j);
                int down=triangle.get(i+1).get(j);
                int diag=triangle.get(i+1).get(j+1);
                triangle.get(i).set(j,current+Math.min(down,diag));
            }
        }
        return triangle.get(0).get(0);
    }
}
