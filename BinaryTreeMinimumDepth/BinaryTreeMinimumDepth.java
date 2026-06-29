package BinaryTreeMinimumDepth;

/**
 * Finds the minimum depth of a binary tree by exploring every root-to-leaf
 * path.
 */
public class BinaryTreeMinimumDepth {
  private int minDepth = 0;
  private int depth = 1;

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    if (root.left == null && root.right == null) {
      return 1;
    }
    traverse(root);
    return minDepth;
  }

  public void traverse(TreeNode node) {
    // Move down one branch at a time and track the current depth.
    if (node.left != null) {
      depth++;
      traverse(node.left);
      depth--;
    }
    if (node.right != null) {
      depth++;
      traverse(node.right);
      depth--;
    }
    if (node.left == null & node.right == null) {
      System.out.println("Depth " + depth);

      // Update the best depth when we reach a leaf.
      if (minDepth == 0) {
        minDepth = depth;
        return;
      }
      if (depth < minDepth) {
        minDepth = depth;
      }
    }
  }
}
