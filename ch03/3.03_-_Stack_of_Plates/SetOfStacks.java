import java.util.*;

public class SetOfStacks {
  List<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
  
  public void push(int v) {
    Stack<Integer> last = getLastStack();
    if (last != null) {
      last.push(v);
    } else {
      Stack stack = new Stack();
      stack.push(v);
      stacks.add(stack);
    }
  }
  
  public int pop() throws EmptyStackException {
    Stack<Integer> last = getLastStack();
    if (last == null)
      throw EmptyStackException();
    int v = last.pop();
    if (last.size() == 0)
      stacks.remove(stacks.size() - 1);
    return v;
  }

  public Stack<Integer> getLastStack() {
    int size = stacks.size();
    if (size == 0) return null;
    return stacks.get(size - 1);
  }

  public boolean isEmpty() {
    Stack last = getLastStack();
    return last == null || last.isEmpty();
  }
}
