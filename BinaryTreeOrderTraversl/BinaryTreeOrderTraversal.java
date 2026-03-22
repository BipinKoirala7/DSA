package BinaryTreeOrderTraversl;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeOrderTraversal {
  List<Integer> list = new ArrayList<>();
  public List<Integer> inorderTraversal(TreeNode root) {
    if(root == null) return List.of();
    traversal(root);
    return list;
  }

  public void traversal(TreeNode currentNode){
    if(currentNode.left != null) {
      traversal(currentNode.left);
    }

    System.out.println("Value: " + currentNode.val);
    list.add(currentNode.val);

    if(currentNode.right != null) {
      traversal(currentNode.right);
    }
  }
}
