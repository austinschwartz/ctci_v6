import java.util.*;

public class PaintFill {
  public static boolean fill(int[][] colors, int r, int c, int newColor) {
    if (colors[r][c] == newColor) return false;
    return fillHelper(colors, r, c, colors[r][c], newColor);
  }

  public static boolean fillHelper(int[][] colors, int r, int c, int oldColor, int newColor) {
    if (r < 0 || r > colors.length - 1 || c < 0 || c > colors[0].length - 1) {
      return false;
    }
    if (colors[r][c] == oldColor) {
      colors[r][c] = newColor;
      fillHelper(colors, r + 1, c,     oldColor, newColor);
      fillHelper(colors, r - 1, c,     oldColor, newColor);
      fillHelper(colors, r,     c + 1, oldColor, newColor);
      fillHelper(colors, r,     c - 1, oldColor, newColor);
    }
    return true;
  }

  public static void main(String[] args) {
    int[][] colors = new int[][]{
      {0, 1, 2, 1, 1, 0},
      {0, 1, 1, 1, 2, 3},
      {1, 1, 2, 2, 2, 1},
      {1, 2, 1, 1, 3, 0},
      {1, 1, 1, 0, 0, 0}
    };
    for (int[] line : colors) {
      for (int num : line)
        System.out.print(num + " ");
      System.out.println(); 
    }
    System.out.println();
    fill(colors, 1, 3, 4);
    for (int[] line : colors) {
      for (int num : line)
        System.out.print(num + " ");
      System.out.println(); 
    }
  }
}
