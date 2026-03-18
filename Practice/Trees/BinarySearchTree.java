package Practice.Trees;

public class BinarySearchTree {
  public Node root;

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

  public Node remove(){
    return null;
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
    if(node.right != null){
      traverse(node.right);
    }

    System.out.print(node.value + " ");
  }
}
