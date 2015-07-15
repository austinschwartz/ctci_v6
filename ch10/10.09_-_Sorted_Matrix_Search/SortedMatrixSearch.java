public class SortedMatrixSearch {
  public static class Element {
    public int row;
    public int col;
    public Element(int row, int col) {
      this.row = row;
      this.col = col;
    }
  }

  public static Element findElement(int[][] matrix, int element) {
    int row = 0;
    int col = matrix[0].length - 1;
    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == element)
        return new Element(row, col);
      else if (matrix[row][col] > element)
        col--;
      else
        row++;
    }
    return null;
  }

  public static void main(String[] args) {
    int[][] matrix = new int[][]{
      {15, 20, 40, 85},
      {20, 35, 80, 95},
      {30, 55, 95, 105},
      {40, 80, 100, 120}
    };
    Element e = findElement(matrix, 55);
    if (e == null)
      System.out.println("Element not found");
    else
      System.out.println("Element at row: " + e.row + " - col: " + e.col);
  }
}
