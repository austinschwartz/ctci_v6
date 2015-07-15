import java.util.*;

public class SortedMerge {
  public static void merge(int[] a, int[] b, int lastA, int lastB) {
    int indexA = lastA - 1;
    int indexB = lastB - 1;
    int indexMerged = lastA + lastB - 1;
    while (indexB >= 0) {
      if (indexA >= 0 && a[indexA] > b[indexB]) {
        a[indexMerged] = a[indexA];
        indexA--;
      } else {
        a[indexMerged] = b[indexB];
        indexB--;
      }
      indexMerged--;
    }
  }
  public static void main(String[] args) {
    int[] a = new int[]{1, 4, 7, 8, 9, 15, -1, -1, -1, -1, -1, -1};
    int[] b = new int[]{2, 3, 5, 11, 12, 16};
    int lastA = 6;
    int lastB = 6;
    merge(a, b, lastA, lastB);
    System.out.println(Arrays.toString(a));
  }
}
