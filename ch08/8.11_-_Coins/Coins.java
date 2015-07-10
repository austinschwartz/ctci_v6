import java.util.*;

public class Coins {
  public static int[] S = new int[]{1, 5, 10, 25};
  public static int countWays(int m, int n) {
    if (n == 0)
      return 1;

    if (n < 0)
      return 0;

    if (m <= 0 && n >= 1)
      return 0;

    return countWays(m - 1, n) + countWays(m, n - S[m-1]);
  }
  public static void main(String[] args) {
    System.out.println(countWays(4, 67));
    System.out.println(countWays(4, 1));
    System.out.println(countWays(4, 4));
    System.out.println(countWays(4, 15));
  }
}
