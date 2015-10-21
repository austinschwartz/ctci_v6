/*
 * Solution is mostly line for line from the book
 */

import java.util.*;

class Node {
  public Node left;
  public Node right;
  public int val;
  public Node(int val) {
    this.val = val;
  }
}

public class BSTSequences {
  public static void weaveLists(LinkedList<Integer> first, LinkedList<Integer> second,
                                ArrayList<LinkedList<Integer>> results, LinkedList<Integer> prefix) {
    /* One list is empty. Add resmainer to [a cloned] prefix and store result. */
    if (first.size() == 0 || second.size() == 0) {
      LinkedList<Integer> result = (LinkedList<Integer>)prefix.clone();
      result.addAll(first);
      result.addAll(second);
      results.add(result);
      return;
    }

    /* Recurse with head of first added to the prefix. Removing the head will damage first,
     * so we'll need to put it back where we found it after. */
    int headFirst = first.removeFirst();
    prefix.addLast(headFirst);
    weaveLists(first, second, results, prefix);
    prefix.removeLast();
    first.addFirst(headFirst);

    /* Do the same thing with second, damaging and then restoring the list. */
    int headSecond = second.removeFirst();
    prefix.addLast(headSecond);
    weaveLists(first, second, results, prefix);
    prefix.removeLast();
    second.addFirst(headSecond);

    return;
  }

  public static ArrayList<LinkedList<Integer>> bstSequences(Node root) {
    ArrayList<LinkedList<Integer>> list = new ArrayList<LinkedList<Integer>>();
    if (root == null) {
      list.add(new LinkedList<Integer>());
      return list;
    }
    
    LinkedList<Integer> prefix = new LinkedList<Integer>();
    prefix.add(root.val);
    
    ArrayList<LinkedList<Integer>> leftList  = bstSequences(root.left);
    ArrayList<LinkedList<Integer>> rightList = bstSequences(root.right);

    /* Weave together each list from the left and right sides */
    for (LinkedList<Integer> left : leftList) {
      for (LinkedList<Integer> right : rightList) {
        ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>();
        weaveLists(left, right, weaved, prefix);
        list.addAll(weaved);
      }
    }
    return list;
  }

  public static void main(String[] args) {
   /*           50
    *          /  \
    *         20   60
    *        / \     \
    *       10  25    70
    *      /  \       / \
    *     5    15    65  80
    */
    Node a = new Node(50);
    Node b = new Node(20);
    Node c = new Node(60);
    Node d = new Node(10);
    Node e = new Node(25);
    Node f = new Node(70);
    Node g = new Node(5);
    Node h = new Node(15);
    Node i = new Node(65);
    Node j = new Node(80);
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.right = f;
    d.left = g;
    d.right = h;
    f.left = i;
    f.right = j;
    ArrayList<LinkedList<Integer>> lists = bstSequences(a);
    for (LinkedList sequence : lists)
      System.out.println(sequence);

   /*           2
    *          / \
    *         1   3
    */
    a = new Node(2);
    b = new Node(1);
    c = new Node(3);
    a.left = b;
    a.right = c;
    lists = bstSequences(a);
    for (LinkedList sequence : lists)
      System.out.println(sequence);
  }
}
