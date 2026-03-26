package Practice.TreeTraversal;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraversal {

  // Breathe First Search
  public List<Integer> levelOrderSearch(TreeNode root){
    TreeNode currentNode = root;
    Queue<TreeNode> queue = new LinkedList<>();
    List<Integer> results = new ArrayList<>();
    queue.add(currentNode);

    while(!queue.isEmpty()){
      currentNode = queue.remove();
      results.add(currentNode.value);
      if(currentNode.left != null){
        queue.add(currentNode.left);
      }
      if(currentNode.right != null){
        queue.add(currentNode.right);
      }
    }
    return results;
  }

  // Depth First Search
  // Inorder Traversal
  public List<Integer> preOrderTraversal(TreeNode root){
    List<Integer> results = new ArrayList<>();

    class Traverse{
      Traverse(TreeNode currentNode){
        results.add(currentNode.value);

        if(currentNode.left != null){
          new Traverse(currentNode.left);
        }
        if(currentNode.right != null){
          new Traverse(currentNode.right);
        }
      }
    }

    new Traverse(root);
    return results;
  }

  // Inorder Traversal
  public List<Integer> inOrderTraversal(TreeNode root){
    List<Integer> results = new ArrayList<>();

    class Traverse{
      Traverse(TreeNode currentNode){
        if(currentNode.left != null){
          new Traverse(currentNode.left);
        }
        results.add(currentNode.value);
        if(currentNode.right != null){
          new Traverse(currentNode.right);
        }
      }
    }

    new Traverse(root);
    return results;
  }

  // Inorder Traversal
  public List<Integer> postOrderTraversal(TreeNode root){
    List<Integer> results = new ArrayList<>();

    class Traverse{
      Traverse(TreeNode currentNode){
        if(currentNode.left != null){
          new Traverse(currentNode.left);
        }
        if(currentNode.right != null){
          new Traverse(currentNode.right);
        }
        results.add(currentNode.value);
      }
    }

    new Traverse(root);
    return results;
  }

}
