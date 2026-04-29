package InvertBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();

    TreeNode node = new TreeNode(1,
        null,
        new TreeNode(2));

    traverse(node);
    System.out.println("-----------Inverted----------");
    TreeNode invertNode = solution.invertTree(node);
    traverse(invertNode);
  }

  public static void traverse(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode currentNode = queue.poll();
      System.out.println(currentNode.val);

      if (currentNode.left != null) {
        queue.add(currentNode.left);
      }
      if (currentNode.right != null) {
        queue.add(currentNode.right);
      }
    }
  }
}
