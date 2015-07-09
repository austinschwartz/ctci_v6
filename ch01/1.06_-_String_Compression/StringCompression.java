import java.util.*;

public class StringCompression {
  public static String compress(String str) {
    StringBuilder sb = new StringBuilder();
    int count = 1;
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) != str.charAt(i + 1)) {
        sb.append(str.charAt(i));
        sb.append(count);
      } else
        count++;
    }
    String x = sb.toString();
    if (x.length() > str.length())
      return str;
    else
      return x;
  }

  public static void main(String[] args) {
    System.out.println(compress("aabccccaaa"));
    System.out.println(compress("abcdef"));
  }
}
