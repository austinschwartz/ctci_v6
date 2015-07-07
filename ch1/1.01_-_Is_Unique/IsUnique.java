import java.util.*;
import java.io.*;

public class IsUnique {
  public static boolean isUniqueUsingHash(String word) {
    char[] chars = word.toCharArray();
    Set<Character> set = new HashSet<Character>();
    for (char c : chars)
      if (set.contains(c))
        return false;
      else 
        set.add(c);
    return true;
  }

  public static boolean isUniqueUsingSort(String word) {
    char[] chars = word.toCharArray();
    if (chars.length <= 1) return true;
    Arrays.sort(chars);
    char temp = chars[0];
    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == temp) return false;
      temp = chars[i];
    }
    return true;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while ((line = br.readLine()) != null) {
      System.out.println(isUniqueUsingHash(line) ? "Unique" : "Not Unique"); 
      System.out.println(isUniqueUsingSort(line) ? "Unique" : "Not Unique"); 
    }
  }
}
