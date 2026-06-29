package BinaryTreeOrderTraversl;

import java.util.ArrayList;
import java.util.List;

/**
 * Performs an inorder traversal of a binary tree.
 */
public class BinaryTreeOrderTraversal {
  List<Integer> list = new ArrayList<>();

  public List<Integer> inorderTraversal(TreeNode root) {
    if (root == null)
      return List.of();
    traversal(root);
    return list;
  }

  public void traversal(TreeNode currentNode) {
    // Visit the left subtree, then the node itself, then the right subtree.
    if (currentNode.left != null) {
      traversal(currentNode.left);
    }

    System.out.println("Value: " + currentNode.val);
    list.add(currentNode.val);

    if (currentNode.right != null) {
      traversal(currentNode.right);
    }
  }
}
