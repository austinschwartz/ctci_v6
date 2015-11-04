import java.util.*;
import java.util.stream.*;

public class LambdaRandom {
  public static List<Integer> getRandomSubsetNoLambda(List<Integer> list) {
    List<Integer> subset = new ArrayList<Integer>();
    Random random = new Random();
    for (int item : list) {
      if (random.nextBoolean()) {
        subset.add(item);
      }
    }
    return subset;
  }

  public static List<Integer> getRandomSubset(List<Integer> list) {
    Random random = new Random();
    List<Integer> subset = list
                          .stream()
                          .filter(k -> { return random.nextBoolean(); })
                          .collect(Collectors.toList());
    return subset;
  }

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>(){{
      add(1);
      add(2);
      add(3);
      add(4);
      add(5);
      add(6);
    }};
    List<Integer> subset = getRandomSubset(list);
    System.out.println(subset);
  }
}
