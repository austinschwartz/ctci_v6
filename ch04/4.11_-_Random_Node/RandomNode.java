import java.util.*;

class TreeNode {
  int val;
  TreeNode left, right;
  int size = 0;
  public TreeNode(int val) {
    this.val = val;
    size = 1;
  }
  public TreeNode getRandomNode() {
    int leftSize = (left == null ? 0 : left.size);
    Random random = new Random();
    int index = random.nextInt(size);
    if (index < leftSize)
      return left.getRandomNode();
    else if (index == leftSize)
      return this;
    else
      return right.getRandomNode();
  }
}

public class RandomNode {
  public static void main(String[] args) {
    TreeNode a = new TreeNode(8);
    TreeNode b = new TreeNode(4);
    TreeNode c = new TreeNode(13);
    TreeNode d = new TreeNode(2);
    TreeNode e = new TreeNode(6);
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    a.size = 5;
    b.size = 3;
    System.out.println(a.getRandomNode().val);
    System.out.println(a.getRandomNode().val);
    System.out.println(a.getRandomNode().val);
    System.out.println(a.getRandomNode().val);
    System.out.println(a.getRandomNode().val);
  }
}
