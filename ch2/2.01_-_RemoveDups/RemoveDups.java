import java.util.*;

public class RemoveDups {
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
  public static void removeDupes(Node node) {
    Set<Character> set = new HashSet<Character>();
    set.add(node.val);
    Node prev = node;
    Node temp = node.next;
    while (temp != null) {
      if (set.contains(temp.val)) {
        prev.next = temp.next;
      }
      else {
        set.add(temp.val);
        prev = temp;
      }
      temp = temp.next;
    }
  }
  public static void main(String[] args) {
    Node a = new Node('F');
    Node b = new Node('O');
    Node c = new Node('L');
    Node d = new Node('L');
    Node e = new Node('O');
    Node f = new Node('W');
    Node g = new Node(' ');
    Node h = new Node('U');
    Node i = new Node('P');
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = g;
    g.next = h;
    h.next = i;
    System.out.println(a);
    removeDupes(a);
    System.out.println(a);
  }
}
