package Practice.Trees;

public class Main {
  static void main() {
    BinarySearchTree searchTree = new BinarySearchTree();

    searchTree.lookUp();

    System.out.println("Insert: " + searchTree.rInsert(47));
    System.out.println("Insert: " + searchTree.insert(21));
    System.out.println("Insert: " + searchTree.rInsert(76));
    System.out.println("Insert: " + searchTree.rInsert(18));
    System.out.println("Insert: " + searchTree.insert(27));
    System.out.println("Insert: " + searchTree.insert(52));
    System.out.println("Insert: " + searchTree.insert(82));
    System.out.println("Insert: " + searchTree.insert(23));
    System.out.println("Insert: " + searchTree.insert(22));
    System.out.println("Insert: " + searchTree.insert(30));
    searchTree.lookUp();

    System.out.println("\nRemove: " + searchTree.remove(82));
    searchTree.lookUp();

    System.out.println("\nRemove: " + searchTree.remove(21));
    searchTree.lookUp();

    System.out.println("\nRemove: " + searchTree.remove(76));
    System.out.println("\nRemove: " + searchTree.remove(18));
    searchTree.lookUp();


    int value = 82;
    System.out.println("Contains " + value + ": " + searchTree.contains(value));
    System.out.println("Contains " + value + ": " + searchTree.rContains(value));

    searchTree.lookUp();
  }
}
