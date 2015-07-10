import java.util.*;

public class WordFrequencies {
  public static Map<String, Integer> map;

  public static void setUpHashTable(String str) {
    map = new HashMap<String, Integer>();
    String[] words = str.split(" ");
    for (String word : words) {
      if (map.containsKey(word))
        map.put(word, map.get(word) + 1);
      else
        map.put(word, 1);
    }
  }

  public static int frequencies(String given) {
    if (map.containsKey(given))
      return map.get(given);
    else
      return 0;
  }
  public static void main(String[] args) {
    String str = "hello this is a test line supposedly representing a book. the book is very short.";
    setUpHashTable(str);
    System.out.println(frequencies("is"));
  }
}
