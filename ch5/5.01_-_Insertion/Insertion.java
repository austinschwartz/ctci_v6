import java.util.*;

public class Insertion {
  public static int updateBit(int num, int i, boolean bitIs1) {
    int value = bitIs1 ? 1 : 0;
    int mask = ~(1 << i);
    return (num & mask) | (value << i);
  }

  public static int insertion(int N, int M, int i, int j) {
    int k = 0;
    for (; i <= j; i++) {
      N = updateBit(N, i, ((M & (1 << k)) != 0) ? true : false);
      k++;
    }
    return N;
  }

  public static void main(String[] args) {
    System.out.println(insertion(1024, 19, 2, 6)); // 1100
  }
}
