import java.util.*;

public class MyQueue<T> {
  Stack<T> stackNew, stackOld;

  public MyQueue() {
    stackNew = new Stack<T>();
    stackOld = new Stack<T>();
  }

  public int size() {
    return stackNew.size() + stackOld.size();
  }

  public void add (T value) {
    stackNew.push(value);
  }

  public void shiftStacks() {
    if (stackOld.isEmpty())
      while (!stackNew.isEmpty()) {
        stackOld.push(stackNew.pop());
      }
    }
  }

  public T peek() {
    shiftStacks();
    return stackOld.peek();
  }

  public T remove() {
    shiftStacks();
    return stackOld.pop();
  }
}
