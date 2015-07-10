import java.util.*;

public class RecursiveMultiply {

  public static int multiply(int a, int b) {
    if (b == 1)
      return a;
    else
      return a + multiply(a, b - 1);
  }

  public static void main(String[] args) {
    System.out.println(multiply(5, 3));
    System.out.println(multiply(25, 1));
    System.out.println(multiply(9, 9));
  }
}
