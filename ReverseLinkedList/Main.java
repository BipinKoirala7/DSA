package ReverseLinkedList;

public class Main {
  static void main() {
    ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    ListNode reversedListNode = reverseLinkedList.reverseList(listNode);

    System.out.println("---------- Original -----------");
    reverseLinkedList.print(listNode);
    System.out.println("---------- After Reversed ----------");
    reverseLinkedList.print(reversedListNode);
  }
}
