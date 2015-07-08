import java.util.*;

public class PalindromePermutation {
  public static boolean permuteHash(String str) {
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < str.length(); i++) {
      Character c = Character.toLowerCase(str.charAt(i));
      if (!Character.isLetter(c))
        continue;
      if (map.containsKey(c))
        map.put(c, map.get(c) + 1);
      else
        map.put(c, 1);
    }

    int odd = 0;
    for (Character key : map.keySet())
      if (map.get(key) % 2 != 0)
        odd++;

    if (odd > 1)
      return false;
    else
      return true;
  }
  public static void main(String[] args) {
    System.out.println(permuteHash("Tact Coa") ? "True" : "False");
    System.out.println(permuteHash("test") ? "True" : "False");
  }
}
