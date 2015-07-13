import java.util.*;

public class Intersection {
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
        sb.append(" ");
        temp = temp.next;
      }
      return sb.toString();
    }
  }

  public static Node intersection(Node a, Node b) {
    int alength = 0;
    int blength = 0;
    Node ahead = a;
    Node bhead = b;
    while (a != null) {
      alength++;
      a = a.next;
    }
    while (b != null) {
      blength++;
      b = b.next;
    }

    Node shorter;
    Node longer;
    int diff;
    if (alength > blength) {
      longer = ahead;
      shorter = bhead;
      diff = alength - blength;
    } else {
      longer = bhead;
      shorter = ahead;
      diff = blength - alength;
    }

    while (diff-- > 0)
      longer = longer.next;

    while (longer != shorter) {
      longer = longer.next;
      shorter = shorter.next;
    }

    return longer;
  }

  public static void main(String[] args) {
    Node a = new Node(3);
    Node b = new Node(1);
    Node c = new Node(5);
    Node d = new Node(9);
    Node e = new Node(7);
    Node f = new Node(2);
    Node g = new Node(1);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = g;
    Node h = new Node(4);
    Node i = new Node(6);
    h.next = i;
    i.next = e;

    Node x = intersection(a, h);
    System.out.println(x);
  }
}
