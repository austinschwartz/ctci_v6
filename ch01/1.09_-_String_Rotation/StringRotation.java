import java.util.*;

public class StringRotation {
  public static boolean isRotation(String s1, String s2) {
    if (s1.length() != s2.length()) 
      return false;

    String s3 = s1 + s1;
    return s3.contains(s2);
  }
  public static void main(String[] args) {
    System.out.println(isRotation("waterbottle", "erbottlewat") ? "True" : "False");
    System.out.println(isRotation("waterbottl", "erbottlewat") ? "True" : "False");
    System.out.println(isRotation("pandeesh", "deeshpand") ? "True" : "False");
  }
}
