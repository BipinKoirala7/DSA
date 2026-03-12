package Practice.LinkedList;

public class LinkedList {
  private Node head;
  private int length;
  private Node tail;

  public LinkedList(){
    this.length = 0;
  }

  public LinkedList(int value){
    this.head = new Node(value);
    this.length = 1;
    this.tail = head;
  }

  public void print(){
    Node temp = head;
    while(temp != null){
      System.out.println(temp.value);
      temp = temp.next;
    }
  }

  public int getLength(){
    return length;
  }

  public Node getHead(){
    return head;
  }

  public Node getTail(){
    return tail;
  }

  public Node get(int index){
    if(index < 0 || index > (length - 1)){
      System.out.println("Index Out of Bounds Exception");
      return null;
    }

    int i = 0;
    Node temp = head;

    while(i != index){
      temp = temp.next;
      i++;
    }

    return temp;
  }

  public Node append(int value){
    Node newNode = new Node(value);

    if(length == 0){
      head = newNode;
    } else{
      tail.next = newNode;
    }

    this.tail = newNode;
    length++;
    return newNode;
  }

  public Node prepend(int value){
    Node newNode = new Node(value);

    if(length == 0){
      newNode.next = head;
      this.head = newNode;
      this.tail = newNode;
    } else{
      newNode.next = head;
      this.head = newNode;
    }

    length++;
    return newNode;
  }

  public boolean set(int index, int value){
    Node temp = get(index);

    if(temp != null){
      temp.value = value;
      return true;
    }

    return false;
  }

  public boolean insert(int index, int value){
    if(index < 0 || index > length){
      System.out.println("Index cannot be larger than the length of the linked list");
      return false;
    }
    if(index == 0){
      prepend(value);
      return true;
    }
    if(index == length){
      append(value);
      return true;
    }

    Node prev = get(index - 1);
    Node newNode = new Node(value);

    newNode.next = prev.next;
    prev.next = newNode;

    length++;
    return true;
  }

  public Node removeLast(){
    if(length == 0){
      System.out.println("Linked list is empty!");
      return null;
    }

    Node temp = head;
    Node prev = head;
    while(temp.next != null){
      prev = temp;
      temp = temp.next;
    }

    tail = prev;
    tail.next = null;
    length--;

    if(length == 0){
      head = null;
      tail = null;
    }
    return temp;
  }

  public Node removeFirst(){
    if(length == 0){
      System.out.println("Linked List is empty");
      return null;
    }

    Node temp = head;
    this.head = head.next;
    temp.next = null;
    this.length--;

    if(length == 0){
      this.tail = null;
    }

    return temp;
  }

  public Node remove(int index){
    if(index < 0 || index >= length){
      System.out.println("Index Out of Bounds for Linked lists");
      return null;
    }
    if(index == 0){
      return removeFirst();
    }
    if(index == (length - 1)){
      return removeLast();
    }

    Node prev = get(index - 1);
    Node indexNode = get(index);

    prev.next = indexNode.next;
    indexNode.next = null;
    length--;
    return indexNode;
  }

  public void reverse(){
    if(length == 0){
      System.out.println("No elements to reverse");
      return;
    }

    Node temp = head;
    head = tail;
    tail = temp;
  }
}
