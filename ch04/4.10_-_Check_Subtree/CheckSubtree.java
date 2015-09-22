public class CheckSubtree {
  public class Node {
    public Node left;
    public Node right;
    public int val;
    public Node(int val) {
      this.val = val;
    }
  }

  // Larger tree = T1
  public boolean containsTree(Node T1, Node T2) {
    if (T2 == null)
      return true;
    return subTree(T1, T2);
  }

  // Larger tree = T1
  public boolean subTree(Node T1, Node T2) {
    if (T1 == null)
      return false;
    else if (T1.val == T2.val && matchTree(T1, T2))
      return true;
    return subTree(T1.left, T2) ||
           subTree(T1.right, T2);
  }

  public boolean matchTree(Node T1, Node T2) {
    if (T1 == null && T2 == null)
      return true;
    else if (T1 == null || T2 == null)
      return false;
    else if (T1.val != T2.val)
      return false;
    else
      return matchTree(T1.left, T2.left) &&
             matchTree(T1.right, T2.right);
  }
}
