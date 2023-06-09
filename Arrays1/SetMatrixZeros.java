import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        Set<Integer> col = new HashSet<>();
        Set<Integer> row = new HashSet<>();

        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    col.add(j);
                    row.add(i);
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
              if(col.contains(j)){
                  matrix[i][j] = 0;
              }
              if(row.contains(i)){
                  matrix[i][j] = 0;
              }     
            }
        }
    }

}