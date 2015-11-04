import java.util.*;

class Node {
  Node left;
  Node right;
  int val;
  public Node(int val) {
    this.val = val;
  }
}
public class PathsWithSum {
  public static int countPathsWithSum(Node root, int sum) {
    if (root == null) return 0;

    int pathsFromRoot = countPathsWithSumFromNode(root, sum, 0);

    int pathsOnLeft = countPathsWithSum(root.left, sum);  
    int pathsOnRight = countPathsWithSum(root.right, sum);  

    return pathsFromRoot + pathsOnLeft + pathsOnRight;
  }

  public static int countPathsWithSumFromNode(Node root, int target, int current) {
    if (root == null) return 0;

    current += root.val;

    int total = 0;
    if (current == target) {
      total++;
    }

    total += countPathsWithSumFromNode(root.left, target, current);
    total += countPathsWithSumFromNode(root.right, target, current);

    return total; 
  }
  public static void main(String[] args) {
    Node a = new Node(10);
    Node b = new Node(5);
    Node c = new Node(-3);
    Node d = new Node(3);
    Node e = new Node(2);
    Node f = new Node(11);
    Node g = new Node(3);
    Node h = new Node(-2);
    Node i = new Node(1);
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.right = f;
    d.left = g;
    d.right = h;
    e.right = i;
    System.out.println(countPathsWithSum(a, 8));
  }
}
