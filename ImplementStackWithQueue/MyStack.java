package ImplementStackWithQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implements a stack using two queues.
 */
public class MyStack<T> {
  Queue<T> queue1;
  Queue<T> queue2;

  public MyStack() {
    queue1 = new LinkedList<>();
    queue2 = new LinkedList<>();
  }

  public void push(T x) {
    // Always keep the newest item at the front of the active queue.
    if (queue1.isEmpty())
      queue1.add(x);
    else if (queue2.isEmpty())
      queue2.add(x);
    else {
      if (queue1.size() > queue2.size()) {
        queue1.forEach(_ -> queue2.poll());
        queue2.add(x);
      } else {
        queue2.forEach(_ -> queue1.poll());
        queue1.add(x);
      }
    }
  }

  public T pop() {
    // Pop from whichever queue currently holds the stack top.
    if (queue1.size() > queue2.size()) {
      return queue2.poll();
    } else {
      return queue1.poll();
    }
  }

  public T top() {
    // Peek the active queue without removing the top element.
    if (queue1.size() > queue2.size())
      return queue1.peek();
    else
      return queue2.peek();
  }

  public boolean empty() {
    return queue1.isEmpty() && queue2.isEmpty();
  }
}
