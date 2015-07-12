import java.util.*;

public class PairsWithSum {
  public static class Pair {
    public int p1;
    public int p2;
    public Pair(int p1, int p2) {
      this.p1 = p1;
      this.p2 = p2;
    }
  }
  public static List<Pair> pairs(int[] nums, int sum) {
    List<Pair> lst = new ArrayList<Pair>();
    Set<Integer> set = new HashSet<Integer>();

    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i]))
        lst.add(new Pair(sum - nums[i], nums[i]));
      else
        set.add((sum - nums[i]));
    }
    return lst;
  }
  public static void main(String[] args) {
    List<Pair> list = pairs(new int[]{1, 4, 2, 5, 6, 7, 0, 3}, 7);
    for (Pair pair : list)
      System.out.println(pair.p1 + " : " + pair.p2);
  }
}
