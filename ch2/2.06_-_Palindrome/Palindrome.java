import java.util.*;

public class Palindrome {
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
  
  public static void reverse(Node node) {
    Node prev = null;
    Node current = node;
    Node next;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    node = prev;
  }

  public static boolean isPalindrome(Node node) {
    Deque<Character> stack = new ArrayDeque<Character>();
    Node head = node;
    Node temp = head;
    while (temp != null) {
      stack.push(temp.val);
      temp = temp.next;
    }
    temp = head;
    while (temp != null) {
      char a = stack.pop();
      if (temp.val != a)
        return false;
      temp = temp.next;
    }
    return true;
  }

  public static void main(String[] args) {
    Node a = new Node('r');
    Node b = new Node('a');
    Node c = new Node('r');
    a.next = b;
    b.next = c;
    System.out.println(isPalindrome(a) ? "True" : "False");
    System.out.println(isPalindrome(b) ? "True" : "False");
    
  }
}
