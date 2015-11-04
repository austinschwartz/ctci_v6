import java.util.*;

class TreeNode {
  int val;
  TreeNode left, right;
  TreeNode(int val) {
    this.val = val;
  }
}
public class FirstCommonAncestor {
  public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || p == null || q == null) return null;
    if (p == q) return null;
    
    if (root == q && root == p)
      return root;

    TreeNode left = commonAncestor(root.left, p, q);
    if (left != null && left != p && left != q) {
      return left;
    }

    TreeNode right = commonAncestor(root.right, p, q);
    if (right != null && right != p && right != q) {
      return right;
    }

    if (left != null && right != null)
      return root;
    else if (root == p || root == q)
      return root;
    else
      return left == null ? right : left;
  }
  public static void main(String[] args) {
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
    e.right = h;
    d.left = f;
    d.right = g;
    TreeNode ancestor = commonAncestor(a, g, h);
    System.out.println(ancestor.val);
  }
}
