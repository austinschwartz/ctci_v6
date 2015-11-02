import java.util.*;

public class PowerSet {
  public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index) {
    ArrayList<ArrayList<Integer>> all;
    if (set.size() == index) { // base case - add empty set
      all = new ArrayList<ArrayList<Integer>>();
      all.add(new ArrayList<Integer>());
    } else {
      all = getSubsets(set, index + 1);
      int item = set.get(index);
      ArrayList<ArrayList<Integer>> more = new ArrayList<ArrayList<Integer>>();
      for (ArrayList<Integer> subset : all) {
        ArrayList<Integer> newSubset = new ArrayList<Integer>();
        newSubset.addAll(subset);
        newSubset.add(item);
        more.add(newSubset);
      }
      all.addAll(more);
    }
    return all;
  }

  public static void main(String[] args) {
    ArrayList<Integer> set = new ArrayList<Integer>();
    set.add(1);
    set.add(2);
    set.add(3);
    ArrayList<ArrayList<Integer>> subsets = getSubsets(set, 0);
    for (ArrayList<Integer> subset : subsets)
      System.out.println(subset);
  }
}
