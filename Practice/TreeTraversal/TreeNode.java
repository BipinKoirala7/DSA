package Practice.TreeTraversal;

public class TreeNode {
  public int value;
  public TreeNode left;
  public TreeNode right;

  TreeNode(int value, TreeNode left, TreeNode right){
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public int getValue(){
    return this.value;
  }
}
