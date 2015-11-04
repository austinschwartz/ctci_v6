import java.util.*;
public class Permutations {
  public static List<String> permute(String str) {
    return permuteHelper(str, str.length());
  } 

  public static List<String> permuteHelper(String str, int i) {
    List<String> ret = new ArrayList<String>();
    if (i == 0) {
      ret.add("");
    } else {
      List<String> prev = permuteHelper(str, i-1);
      for (String a : prev) {
        List<String> lst = insertInto(a, str.charAt(i - 1));
        ret.addAll(lst);
      }
    }
    return ret;
  }
  
  public static List<String> insertInto(String a, char b) {
    List<String> ret = new ArrayList<String>();
    for (int i = 0; i < a.length(); i++) {
      String newString = a.substring(0, i) + b + a.substring(i);
      ret.add(newString);
    }
    ret.add(a + b);
    return ret;
  }

  public static void main(String[] args) {
    List<String> permutations = permute("abcd");
    for (String p : permutations) 
      System.out.println(p);
  }
}
