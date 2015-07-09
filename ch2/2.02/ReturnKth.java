import java.util.*;

public class ReturnKth {
  public static class Node {
    Node next;
    char val;
    public Node(char val) {
      this.val = val;
    }
    public String toString() {
      StringBuilder sb = new StringBuilder();
      Node temp = this;
      while (temp != null) {
        sb.append(temp.val);
        temp = temp.next;
      }
      return sb.toString();
    }
  }
  public static Node returnKth(Node node, int k) {
    k--;
    Node first = node;
    Node last = node;
    for (int i = 0; i < k; i++)
      last = last.next;
    while (last.next != null) {
      last = last.next;
      first = first.next;
    }
    return first;
  }
  public static void main(String[] args) {
    Node a = new Node('a');
    Node b = new Node('b');
    Node c = new Node('c');
    Node d = new Node('d');
    Node e = new Node('e');
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    System.out.println(a);
    System.out.println(returnKth(a, 2).val); // should be d
  }
}
