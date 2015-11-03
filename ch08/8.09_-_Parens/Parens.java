import java.util.*;

public class Parens {
  public static Set<String> generateParens(int index) {
    Set<String> set = new HashSet<String>();
    if (index == 0) {
      set.add("");
    } else {
      Set<String> prev = generateParens(index - 1);
      for (String a : prev) {
        for (int i = 0; i < a.length(); i++)
          if (a.charAt(i) == '(')
            set.add(insertInside(a, i));
        set.add("()" + a);
      }
    }
    return set;
  }
  
  public static String insertInside(String str, int leftParen) {
    String left = str.substring(0, leftParen + 1);
    String right = str.substring(leftParen + 1);
    return left + "()" + right;
  }

  public static void main(String[] args) {
    for (int i = 1; i < 5; i++) {
      Set<String> test = generateParens(i);
      for (String str : test)
        System.out.println(str);
    }
  }
}
