import java.util.*;

public class SumLists {
  public static class Node {
    Node next;
    int val;
    public Node(int val) {
      this.val = val;
    }
    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      Node temp = this;
      while (temp != null) {
        sb.append(temp.val);
        sb.append(' ');
        temp = temp.next;
      }
      return sb.toString();
    }
  }

  public static Node nodeSum(Node a, Node b, int carry) {
    if (a == null && b == null && carry == 0)
      return null;

    int value = carry;
    if (a != null)
      value += a.val;
    if (b != null)
      value += b.val;
    Node result = new Node(value % 10);
    if (a != null || b != null) {
      Node next = nodeSum(a == null ? null : a.next,
                          b == null ? null : b.next,
                          value / 10);
      result.next = next;
    }
    return result;
  }

  public static void main(String[] args) {
    Node a = new Node(7);
    Node b = new Node(1);
    Node c = new Node(6);
    a.next = b;
    b.next = c;
    
    Node d = new Node(5);
    Node e = new Node(9);
    Node f = new Node(2);
    d.next = e;
    e.next = f;

    Node x = nodeSum(a, d, 0);
    System.out.println(x);
  }
}
