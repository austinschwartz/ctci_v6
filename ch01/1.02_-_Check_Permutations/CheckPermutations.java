import java.util.*;
import java.io.*;

public class CheckPermutations {
  public static boolean isPermutation(char[] a, char[] b) {
    Arrays.sort(a);
    Arrays.sort(b);
    if (a.length != b.length) return false;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) return false;
    }
    return true;
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while ((line = br.readLine()) != null) {
      String[] lst = line.split(" ");
      char[] str1 = lst[0].toCharArray();
      char[] str2 = lst[1].toCharArray();
      System.out.println(isPermutation(str1, str2) ? "It is a permutation" : "It is not a permutation");
    }
  }
}
