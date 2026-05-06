package BinaryTreePath;

import java.util.ArrayList;
import java.util.List;

class Solution {
  List<String> list = new ArrayList<>();

  // This is from Leetcode solver because it was 100% and probably you can see
  // from the
  // words choosen and other things
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    helper(res, root, sb);
    return res;
  }

  private void helper(List<String> res, TreeNode root, StringBuilder sb) {
    if (root == null) {
      return;
    }
    int len = sb.length();
    sb.append(root.value);
    if (root.left == null && root.right == null) {
      res.add(sb.toString());
    } else {
      sb.append("->");
      helper(res, root.left, sb);
      helper(res, root.right, sb);
    }
    sb.setLength(len);
  }

  public List<String> binaryTreePaths2(TreeNode root) {
    if (root == null)
      return list;
    dfs(root, "");
    return list;
  }

  private void dfs(TreeNode node, String path) {
    if (node == null)
      return;

    if (path.isEmpty()) {
      path = "" + node.value;
    } else {
      path = path + "->" + node.value;
    }

    if (node.left == null && node.right == null) {
      list.add(path);
      return;
    }

    dfs(node.left, path);
    dfs(node.right, path);
  }
}