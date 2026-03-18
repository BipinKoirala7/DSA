package Practice.Trees;

public class Main {
  static void main() {
    BinarySearchTree searchTree = new BinarySearchTree();

    searchTree.lookUp();

    System.out.println("Insert: " + searchTree.insert(1));
    System.out.println("Insert: " + searchTree.insert(2));
    System.out.println("Insert: " + searchTree.insert(3));
    System.out.println("Insert: " + searchTree.insert(4));
    System.out.println("Insert: " + searchTree.insert(5));
    System.out.println("Insert: " + searchTree.insert(6));

    int value = 3;
    System.out.println("Contains " + value + ": " + searchTree.contains(value));

    searchTree.lookUp();
  }
}
