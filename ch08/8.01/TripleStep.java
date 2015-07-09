import java.util.*;

public class TripleStep {
  public static int memo[] = new int[1024];

  public static int ways(int n) {
    if (n < 0) 
      return 0;
    else if (n == 0) 
      return 1;
    else if (memo[n] > 0)
      return memo[n];
    else {
      memo[n] = ways(n-1) + ways(n-2) + ways(n-3);
      return memo[n];
    }
  }
  public static void main(String[] args) {
    System.out.println(ways(5));
    System.out.println(ways(12));
    System.out.println(ways(30));
  }
}
