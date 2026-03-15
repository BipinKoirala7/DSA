package ReverseLinkedList;

public class ReverseLinkedList {

  private final ListNode reverse = new ListNode();
  private ListNode temp;

  public ListNode reverseList(ListNode head) {
    if(head == null){
      return null;
    }

    temp = reverse;
    collectReverseNode(head);
    return reverse.next;
  }

  private void collectReverseNode(ListNode current){
    if(current.next != null){
      collectReverseNode(current.next);
    }
    System.out.println(current.val);
    temp.next = new ListNode(current.val);
    temp = temp.next;
  }

  public void print(ListNode node){
    while(node != null){
      System.out.println(node.val);
      node = node.next;
    }
  }
}
