public class Conversion {
  public static int conversion(int a, int b) {
    if (b > a) {
      int temp = a;
      a = b;
      b = temp;
    }
    int count = 0;
    while (a > 0) {
      int aBit = a & 1;
      int bBit = b & 1;
      if (aBit != bBit)
        count++;
      a >>= 1;
      b >>= 1;
    }
    return count;
  }

  public static int conversionBetter(int a, int b) {
    int count = 0;
    for (int c = a ^ b; c > 0; c = c >> 1) {
      count += c & 1;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(conversion(29, 15));
    System.out.println(conversion(1024, 15));
    System.out.println(conversionBetter(1024, 15));
  }
}
