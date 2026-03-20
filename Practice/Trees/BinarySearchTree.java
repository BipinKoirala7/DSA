package Practice.Trees;

import java.util.Objects;

public class BinarySearchTree {
  public Node root;

  private Node rInsert(Node currentNode, int value){
    if(currentNode.value == value) return null;
    if(value > currentNode.value) {
      if(currentNode.right != null) return rInsert(currentNode.right, value);
      currentNode.right = new Node(value);
    }
    else {
      if(currentNode.left != null) return rInsert(currentNode.left, value);
      currentNode.left = new Node(value);
    }
    return currentNode;
  }

  public boolean rInsert(int value){
    if(root == null) {
      root = new Node(value);
      return true;
    }
    return Objects.nonNull(rInsert(root, value));
  }

  public boolean insert(int value){
    Node newNode = new Node(value);
    if(root == null){
      root = newNode;
      return true;
    }

    Node temp = root;

    while (true){
      if(temp.value == newNode.value) return false;

      if(newNode.value > temp.value){
        if(temp.right == null){
          temp.right = newNode;
          return true;
        }
          temp = temp.right;
      } else {
        if(temp.left == null){
          temp.left = newNode;
          return true;
        }
          temp = temp.left;
      }
    }
  }

  private boolean rContains(Node temp, int value){
    if(temp == null) return false;
    if(temp.value == value) return true;
    if(value > temp.value) return rContains(temp.right, value);
    else return rContains(temp.left, value);
  }

  public boolean rContains(int value){
    return rContains(root, value);
  }


  public boolean contains(int value){
    Node temp = root;

    while (temp != null){
      if(value > temp.value){
        temp = temp.right;
      } else if(value < temp.value){
        temp = temp.left;
      } else {
        return true;
      }
    }
    return false;
  }

  // Do it in recursive function way
  // you will need a method to calculate minimum value of the given tree.
  public Node remove(int value){
    Node temp = root;
    Node parent = root;
    
    while(temp != null){

      if(value > temp.value){
        parent = temp;
        temp = temp.right;
      } else if(value < temp.value){
        parent = temp;
        temp = temp.left;
      } else {
        if(temp.right == null && temp.left == null){
          if(parent.right == temp) {
            parent.right = null;
          } else {
            parent.left = null;
          }
          return temp;
        } else if(temp.right == null) {
          if(parent.right == temp){
            parent.right = temp.left;
          } else {
            parent.left = temp.left;
          }
          temp.left = null; //  Kill any connections
          return temp;
        } else if(temp.left == null) {
          if(parent.left == temp){
            parent.left = temp.right;
          } else {
            parent.right = temp.right;
          }
          temp.right = null; //  Kill any connections
          return temp;
        } else {
          Node minimumNode = minimum(temp.right);
          if(parent.left == temp){
            parent.left.value = minimumNode.value;
          } else {
            parent.right.value = minimumNode.value;
          }
          remove(temp.right, minimumNode.value);
          return temp;
        }
      }
    }
    return null;
  }

  private void remove(Node currentNode, int value){
    Node temp = currentNode;
    Node parent = currentNode;

    while(temp != null){
      if(temp.value == value){
        parent.left = null;
        return;
      }
      parent = temp;
      temp = temp.left;
    }
  }

  private Node minimum(Node currentNode){
    if(currentNode == null) return null;
    Node temp = currentNode;

    while(true){
      if(temp.left == null) return temp;
      temp = temp.left;
    }
  }

  public void lookUp(){
    if(root == null){
      return;
    }
    Node temp = root;
    traverse(temp);
  }

  private void traverse(Node node){
    if(node.left != null){
      traverse(node.left);
    }

    System.out.print(node.value + " ");

    if(node.right != null){
      traverse(node.right);
    }

  }
}
