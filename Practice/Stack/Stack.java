package Practice.Stack;

public class Stack {
  Node top;
  int height;

  Stack(){
    top = null;
    height = 0;
  }

  Stack(int value){
    top = new Node(value);
    height = 1;
  }

  public void printStack(){
    System.out.println("----------");
    Node temp = top;
    while(temp != null){
      System.out.println(temp.value);
      temp = temp.next;
    }
    System.out.println("----------");
  }

  public int getHeight(){
    return height;
  }

  public Node getTop(){
    return top;
  }

  public Node push(int value){
    Node newNode = new Node(value);
    newNode.next = top;
    top = newNode;
    height++;
    return newNode;
  }

  public Node pop(){
    if(height == 0) return null;

    Node temp = top;
    top = temp.next;
    temp.next = null;
    height--;
    return temp;
  }
}
