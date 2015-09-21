import java.util.*;

public class ListOfDepths {
  public static class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int val;
    public TreeNode(int val) {
      this.val = val;
    }
  }

  public static ArrayList<LinkedList<TreeNode>> createList(TreeNode root) {
    ArrayList<LinkedList<TreeNode>> res = new ArrayList<LinkedList<TreeNode>>();

    LinkedList<TreeNode> current = new LinkedList<TreeNode>();
    if (root != null)
      current.add(root);

    while (current.size() > 0) {
      res.add(current);
      LinkedList<TreeNode> parents = current;

      current = new LinkedList<TreeNode>();
      for (TreeNode parent : parents) {
        if (parent.left != null)
          current.add(parent.left);
        if (parent.right != null)
          current.add(parent.right);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    TreeNode a = new TreeNode(1);
    TreeNode b = new TreeNode(2);
    TreeNode c = new TreeNode(3);
    TreeNode d = new TreeNode(4);
    TreeNode e = new TreeNode(5);
    TreeNode f = new TreeNode(5);
    a.left = b;
    a.right = c;
    c.left = d;
    c.right = e;
    e.right = f;
    ArrayList<LinkedList<TreeNode>> list = createList(a);
    for (LinkedList<TreeNode> ll : list) {
      for (TreeNode node : ll)
        System.out.print(node.val + " ");
      System.out.println();
    }
  }
  
}
