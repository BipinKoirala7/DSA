package InvertBinaryTree;

public class Solution {
  public TreeNode invertTree(TreeNode root) {
    if (root == null)
      return root;

    class Traverse {
      public void traverse(TreeNode currentNode) {

        System.out.println("-----------Traversing------------");
        System.out.println("Number: " + currentNode.val);

        if (currentNode.left != null && currentNode.right != null) {
          System.out.println("Both of them aren't null'");
          TreeNode temp = currentNode.left;
          currentNode.left = currentNode.right;
          currentNode.right = temp;
        } else if (currentNode.left == null && currentNode.right != null) {
          System.out.println("Left is null & Right isn't'");
          currentNode.left = currentNode.right;
          currentNode.right = null;
        } else if (currentNode.left != null && currentNode.right == null) {
          System.out.println("Left isn't null but right is'");
          currentNode.right = currentNode.left;
          currentNode.left = null;
        }

        if (currentNode.left != null) {
          System.out.println("Going to left: " + currentNode.left.val);
          traverse(currentNode.left);
        }
        if (currentNode.right != null) {
          System.out.println("Going to right: " + currentNode.right.val);
          traverse(currentNode.right);
        }

      }
    }

    Traverse traverse = new Traverse();
    traverse.traverse(root);

    return root;
  }
}
