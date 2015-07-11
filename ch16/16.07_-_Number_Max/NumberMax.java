public class NumberMax {
  public static int max(int a, int b) {
    // if diff is negative, return b;
    int diff = a - b;

    // x = 1 if diff is negative (b > a)
    // x = 0 if diff is positive (a > b)
    int x = (diff >> 31) & 0x1;

    int max = a - x * diff;

    return max;
  }
  public static void main(String[] args) {
    System.out.println(max(28, 92));
  }
}
