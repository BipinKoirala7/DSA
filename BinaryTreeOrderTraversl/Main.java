package BinaryTreeOrderTraversl;

public class Main {
  static void main() {
    BinaryTreeOrderTraversal treeOrderTraversal = new BinaryTreeOrderTraversal();
    System.out.println(
        treeOrderTraversal
            .inorderTraversal(
                new TreeNode(
                    1,
                    new TreeNode(
                        2,
                        new TreeNode(4),
                        new TreeNode(5, new TreeNode(6), new TreeNode(7))),
                    new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null)))
            )
    );
  }
}
