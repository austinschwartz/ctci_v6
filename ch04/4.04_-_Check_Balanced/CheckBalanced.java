public class CheckBalanced {
  public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int val;
    public TreeNode(int val) {
      this.val = val;
    }
  }
  public int checkHeight(TreeNode root) {
    if (root == null) return 0;

    int left = checkHeight(root.left);
    if (left == -1) return -1;

    int right = checkHeight(root.left);
    if (right == -1) return -1;

    int diff = Math.abs(left - right);
    if (diff > 1)
      return -1;
    else
      return Math.max(left, right) + 1;
  }

  public boolean isBalanced(TreeNode root) {
    return (checkHeight(root) == -1);
  }
}
