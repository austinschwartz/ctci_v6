import java.util.*;
public class RotateMatrix {
  public static void rotate(int[][] matrix) {
    int n = matrix.length;
    for (int layer = 0; layer < n / 2; layer++) {
      int first = layer;
      int last = n - 1 - layer;
      for (int i = first; i < last; i++) {
        int offset = i - first;
        int top = matrix[first][i];
        
        // left -> top
        matrix[first][i] = matrix[last-offset][first];

        // bottom -> left
        matrix[last-offset][first] = matrix[last][last-offset];

        // right -> bottom
        matrix[last][last-offset] = matrix[i][last];

        // top -> right
        matrix[i][last] = top;
      }
    }
  }
  public static void main(String[] args) {
    int[][] arr = new int[][]{
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25}
    };
    rotate(arr);
    for (int[] a : arr)
      System.out.println(Arrays.toString(a));
  }
}
