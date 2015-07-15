import java.util.*;

public class FindDuplicates {
  public static List<Integer> findDuplicates(int[] arr) {
    List<Integer> duplicates = new ArrayList<Integer>();
    BitSet bs = new BitSet(32001);
    for (int num : arr) {
      if (bs.get(num) == false)
        bs.set(num);
      else
        duplicates.add(num);
      bs.set(num);
    }
    return duplicates;
  }
  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 8};
    List<Integer> duplicates = findDuplicates(arr);
    for (int num : duplicates)
      System.out.println(num);
  }
}
