import java.util.*;

public class Partition {
  public static class Node {
    Node next;
    int val;
    public Node(int val) {
      this.val = val;
    }
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

  public static Node partition(Node node, int partition) {
    Node prev = null;
    Node temp = node;
    Node next = node.next;

    Node less = null;
    Node more = null;
    Node lessHead = null;
    Node moreHead = null;

    while (temp != null) {
      next = temp.next;
      temp.next = null;
      if (temp.val < partition) {
        if (less == null) {
          less = temp;
          lessHead = less;
        } else {
          less.next = temp;
        }
        if (less.next != null)
          less = less.next;
      } else {
        if (more == null) {
          more = temp;
          moreHead = more;
        } else {
          more.next = temp;
        }
        if (more.next != null)
          more = more.next;
      }
      prev = temp;
      temp = next;
    }
    
    less.next = moreHead;
    return lessHead;
  }

  public static void main(String[] args) {
    Node a = new Node(3);
    Node b = new Node(5);
    Node c = new Node(8);
    Node d = new Node(5);
    Node e = new Node(10);
    Node f = new Node(2);
    Node g = new Node(1);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = g;
    System.out.println(a);
    Node x = partition(a, 5);
    System.out.println(x);
  }
}
