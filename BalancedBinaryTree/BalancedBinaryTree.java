package BalancedBinaryTree;

/**
 * Checks whether a binary tree is height-balanced.
 */
public class BalancedBinaryTree {
  public boolean isBalanced(TreeNode root) {
    return dfsHeight(root) != -1;
  }

  private int dfsHeight(TreeNode node) {
    if (node == null)
      return 0;

    // A subtree is unbalanced as soon as one side returns -1.
    int leftHeight = dfsHeight(node.left);
    if (leftHeight == -1)
      return -1;

    int rightHeight = dfsHeight(node.right);
    if (rightHeight == -1)
      return -1;

    if (Math.abs(leftHeight - rightHeight) > 1) {
      return -1;
    }

    return 1 + Math.max(leftHeight, rightHeight);
  }
}
