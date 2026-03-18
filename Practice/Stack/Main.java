package Practice.Stack;

public class Main {
  static void main() {
    Stack stack = new Stack(2);

    stack.printStack();
    System.out.println("Push: " + stack.push(3).getValue());
    System.out.println("Push: " + stack.push(4).getValue());
    System.out.println("Push: " + stack.push(5).getValue());
    System.out.println("Push: " + stack.push(6).getValue());

    System.out.println("Pop: " + stack.pop().getValue());

    stack.printStack();
    System.out.println("Height: " + stack.getHeight());
    System.out.println("Top: " + stack.getTop().getValue());
  }
}
