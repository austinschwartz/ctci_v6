import java.util.*;

public class NumberSwapper {
  public static void main(String[] args) {
    int x = 5;
    int y = 6;
    
    x = x ^ y;
    y = y ^ x;
    x = x ^ y;

    System.out.println("x: " + x);
    System.out.println("y: " + y);
  }
}
