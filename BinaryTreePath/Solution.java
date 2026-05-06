package BinaryTreePath;

import java.util.ArrayList;
import java.util.List;

class Solution {
  List<String> list = new ArrayList<>();

  public List<String> binaryTreePaths(TreeNode root) {
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