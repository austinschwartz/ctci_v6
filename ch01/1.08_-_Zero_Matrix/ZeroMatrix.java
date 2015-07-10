import java.util.*;

public class ZeroMatrix {
  public static void zero(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    boolean[] row = new boolean[m];
    boolean[] col = new boolean[n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 0) {
          row[i] = true;
          col[j] = true;
        }
      }
    }
    
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (row[i] == true || col[j] == true)
          matrix[i][j] = 0;
      }
    }
    
    return;
  }
  public static void main(String[] args) {
    int[][] matrix = new int[][]{
      {0, 1, 1, 1, 0},
      {1, 0, 1, 0, 1},
      {1, 1, 1, 1, 1},
      {1, 0, 1, 1, 1},
      {1, 1, 1, 1, 1}
    };
    for (int i = 0; i < matrix.length; i++)
      System.out.println(Arrays.toString(matrix[i]));
    zero(matrix);
    System.out.println();
    for (int i = 0; i < matrix.length; i++)
      System.out.println(Arrays.toString(matrix[i]));
  }
}
