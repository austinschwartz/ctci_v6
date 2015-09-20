import java.util.*;

public class LRUCache {
  public Node head;
  public Node tail;
  public int capacity;
  public Map<Integer, Node> map = new HashMap<Integer, Node>();

  public LRUCache(int capacity) {
    this.capacity = capacity;
  }

  public String get(int key) {
    if (map.containsKey(key)) {
      Node n = map.get(key);
      remove(n);
      setHead(n);
      return n.value;
    }
    return null;
  }

  public void set(int key, String value) {
    if (map.containsKey(key)) {
      Node old = map.get(key);
      old.value = value;
      remove(old);
      setHead(old);
    } else {
      Node node = new Node(key, value);
      if (map.size() >= capacity) {
        map.remove(tail.key);
        remove(tail);
        setHead(node);
      } else {
        setHead(node);
      }
      map.put(key, node);
    }
  }

  public void remove(Node node) {
    if (node == null) return;

    if (node.prev != null) node.prev.next = node.next;
    if (node.next != null) node.next.prev = node.prev;
    if (node == head) head = node.next;
    if (node == tail) tail = node.prev;
  }

  public void setHead(Node node) {
    if (head == null) {
      head = node;
      tail = node;
    } else {
      head.prev = node;
      node.next = head;
      head = node;
    }
  }
 
  public static class Node {
    public Node next;
    public Node prev;
    public int key;
    public String value;

    public Node(int k, String v) {
      this.key = k;
      this.value = v;
    }
  }

}
