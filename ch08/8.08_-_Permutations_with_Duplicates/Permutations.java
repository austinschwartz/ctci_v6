import java.util.*;
public class Permutations {
  public static Set<String> permute(String str) {
    return permuteHelper(str, str.length());
  } 

  public static Set<String> permuteHelper(String str, int i) {
    Set<String> ret = new HashSet<String>();
    if (i == 0) {
      ret.add("");
    } else {
      Set<String> prev = permuteHelper(str, i-1);
      for (String a : prev) {
        Set<String> lst = insertInto(a, str.charAt(i - 1));
        ret.addAll(lst);
      }
    }
    return ret;
  }
  
  public static Set<String> insertInto(String a, char b) {
    Set<String> ret = new HashSet<String>();
    for (int i = 0; i < a.length(); i++) {
      String newString = a.substring(0, i) + b + a.substring(i);
      ret.add(newString);
    }
    ret.add(a + b);
    return ret;
  }

  public static void main(String[] args) {
    Set<String> permutations = permute("aaaaaab");
    for (String p : permutations) 
      System.out.println(p);
  }
}
