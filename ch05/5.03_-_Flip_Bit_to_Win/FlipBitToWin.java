import java.util.*;

public class FlipBitToWin {
  public static int longestSequence(int n) {
    int maxSeq = 0;

    for (int i = 0; i < 32; i++) {
      maxSeq = Math.max(maxSeq, longestSequenceOfOnes(n, i));
    }

    return maxSeq;
  }

  public static int longestSequenceOfOnes(int n, int ignore) {
    int longestSeq = 0;
    int seq = 0;
    for (int i = 0; i < 32; i++) {
      // count sequence of 1s starting from i, ignoring ignore
      if (getBit(n, i) || i == ignore) {
        seq++;
        longestSeq = Math.max(seq, longestSeq);
      } else {
        seq = 0;
      }
    }
    return longestSeq;
  }

  public static boolean getBit(int num, int i) {
    return ((num & (1 << i)) != 0); // or ((num >> i) & 1)
  }

  public static void main(String[] args) {
    System.out.println(longestSequence(1775)); // 11011101111
    System.out.println(longestSequence(122)); // 1111010
  }
}
