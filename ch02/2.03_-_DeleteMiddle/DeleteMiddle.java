import java.util.*;

public class DeleteMiddle {
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

  public static boolean deleteMiddle(Node node) {
    if (node == null || node.next == null) {
      return false;
    } else {
      node.val = node.next.val;
      node.next = node.next.next;
      return true;
    }
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
    deleteMiddle(c);
    System.out.println(a);
  }
}
