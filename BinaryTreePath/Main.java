package BinaryTreePath;

public class Main {
  public static void main(String[] args) {
    TreeNode treeNode = new TreeNode(1);
    Solution solution = new Solution();

    System.out.println(solution.binaryTreePaths(treeNode).toString());
  }
}