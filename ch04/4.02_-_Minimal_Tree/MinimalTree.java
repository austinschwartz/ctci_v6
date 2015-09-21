import java.util.*;

public class MinimalTree {
  public class Node {
    public int key;
    public Node left;
    public Node right;
    public Node(int a) {
      this.key = a;
    }
  }
  public Node createBST(int[] array) {
    return createBST(array, 0, array.length - 1);
  }
  public Node createBST(int[] array, int start, int end) {
    if (end < start) return null;

    //int mid = (start + end) / 2; // don't do this 
    int mid = start + ((end - start) / 2);

    Node node = new Node(array[mid]);
    node.left = createBST(array, start, mid - 1);
    node.right = createBST(array, mid + 1, end);
    return node;
  }
}
