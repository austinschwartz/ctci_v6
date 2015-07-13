import java.util.*;

public class LoopDetection {
  public static class Node {
    Node next;
    int val;
    public Node(int val) {
      this.val = val;
    }
    public String toString() {
      return this.val + "";
    }
  }

  public static Node findBeginning(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow)
        break;
    }

    if (fast == null || fast.next == null)
      return null;

    slow = head;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }
    return fast;
  }

  public static void main(String[] args) {
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    Node e = new Node(5);
    Node f = new Node(6);
    Node g = new Node(7);
    Node h = new Node(8);
    Node i = new Node(9);
    Node j = new Node(10);
    Node k = new Node(11);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = g;
    g.next = h;
    h.next = i;
    i.next = j;
    j.next = k;
    k.next = c;

    System.out.println(a);
    System.out.println(findBeginning(a));
  }
}
