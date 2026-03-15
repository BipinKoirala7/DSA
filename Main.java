import Practice.LinkedList.LinkedList;


public class Main {
  static void main() {
    LinkedList linkedList = new LinkedList();

    linkedList.prepend(2);
    linkedList.prepend(5);

    System.out.println("Head " + linkedList.getHead().getValue());
    System.out.println("Tail  " + linkedList.getTail().getValue());

    System.out.println("Prepend " + linkedList.prepend(5).getValue());
    System.out.println("Insert at " + linkedList.insert(4, 5));

    System.out.println("Remove First " + linkedList.removeFirst().getValue());
    System.out.println("Remove Last " + linkedList.removeLast().getValue());
    System.out.println("Remove at " + linkedList.remove(3).getValue());

    linkedList.print();

  }
}