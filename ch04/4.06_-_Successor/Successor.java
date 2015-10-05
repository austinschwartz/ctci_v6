public class Successor {
  public static class TreeNode { 
    public int val;
    public TreeNode right;
    public TreeNode left;
    public TreeNode parent;
    public TreeNode(int val) {
      this.val = val;
    }
  }
  public static TreeNode successor(TreeNode n) {
    if (n == null) return null;

    if (n.right != null) {
      return leftMostChild(n.right);
    } else {
      TreeNode temp = n;
      TreeNode parent = n.parent;
      while (parent.right == temp) {
        temp = parent;
        parent = parent.parent;
      }
      return temp;
    }
  }

  public static TreeNode leftMostChild(TreeNode n) {
    if (n == null) return null;
    while (n.left != null) {
      n = n.left;
    }
    return n;
  }

  public static void main(String[] args) {
    /*        20
     *       /  \
     *      10   30
     *     /  \ 
     *    5    15 
     *   / \     \
     *  3   7     17
     */
    TreeNode a = new TreeNode(20);
    TreeNode b = new TreeNode(10);
    TreeNode c = new TreeNode(30);
    TreeNode d = new TreeNode(5);
    TreeNode e = new TreeNode(15);
    TreeNode f = new TreeNode(3);
    TreeNode g = new TreeNode(7);
    TreeNode h = new TreeNode(17);
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    d.left = f;
    d.right = g;
    e.right = h;
    h.parent = e;
    g.parent = d;
    f.parent = d;
    e.parent = b;
    d.parent = b;
    b.parent = a;
    c.parent = a;
    System.out.println(successor(b).val);
    System.out.println(successor(d).val);
    System.out.println(successor(a).val);
  }
}
