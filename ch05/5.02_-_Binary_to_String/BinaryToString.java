public class BinaryToString {

  public static String binaryToString(double x) {
    if (x > 1 || x < 0) return "ERROR";

    StringBuilder sb = new StringBuilder();
    sb.append(".");
    while (x > 0) {
      double r = x * 2;
      if (r >= 1) {
        sb.append(1);
        x = r - 1;
      } else{
        sb.append(0);
        x = r;
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(binaryToString(0.72));
  }
}
