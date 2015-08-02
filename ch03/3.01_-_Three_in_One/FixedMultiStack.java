import java.util.*;

public class FixedMultiStack {
  private int numberOfStacks = 3;
  private int stackCapacity;
  private int[] values;
  private int[] sizes;

  public FixedMultiStack(int stackSize) {
    stackCapacity = stackSize;
    values = new int[stackSize * numberOfStacks];
    sizes = new int[numberOfStacks];
  }

  public void push(int stackNum, int value) throws FullStackException {
    if (isFull(stackNum))
      throw new FullStackException();
    sizes[stackNum]++;
    values[indexOfTop(stackNum)] = value;
  }

  public int pop(int stackNum) throws EmptyStackException {
    if (isEmpty(stackNum))
      throw new EmptyStackException();
    int val = values[indexOfTop(stackNum)];
    sizes[stackNum]--;
    return val;
  }

  public int peek(int stackNum) throws EmptyStackException {
    if (isEmpty(stackNum))
      throw new EmptyStackException();
    return values[indexOfTop(stackNum)];
  }

  public boolean isEmpty(int stackNum) {
    return sizes[stackNum] == 0;
  }

  public boolean isFull(int stackNum) {
    return sizes[stackNum] == stackCapacity;
  }

  private int indexOfTop(int stackNum) {
    int offset = stackNum * stackCapacity;
    int size = sizes[stackNum];
    return offset + size;   
  }
}
