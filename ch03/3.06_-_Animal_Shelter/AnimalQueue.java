import java.util.*;

abstract class Animal {
  private int order;
  protected String name;
  public Animal(String n) { name = n; }
  public void setOrder(int order) { order = order; }
  public int getOrder() { return order; }

  public boolean isOlderThan(Animal a) {
    return this.order < a.getOrder();
  }
}

public class AnimalQueue {
  LinkedList<Dog> dogs = new LinkedList<Dog>();
  LinkedList<Cat> cats = new LinkedList<Cat>();
  private int order = 0;

  public void enqueue(Animal a) {
    a.setOrder(order);
    order++;

    if (a instanceof Dog)
      dogs.addLast((Dog)a);
    else
      cats.addLast((Cat)a);
  }

  public Animal dequeueAny() throws EmptyQueueException {
    if (dogs.size() == 0 && cats.size() == 0)
      throw new EmptyQueueException();
    if (dogs.size() == 0)
      return dequeueCat();
    if (cats.size() == 0)
      return dequeueDog();

    Cat oldestCat = cats.peek();
    Dog oldestDog = dogs.peek();
    if (oldestCat.isOlderThan(oldestDog))
      return dequeueCat();
    else
      return dequeueDog();
  }

  public Animal peek() throws EmptyQueueException {
    if (dogs.size() == 0 && cats.size() == 0)
      throw new EmptyQueueException();
    if (dogs.size() == 0)
      return cats.peek();
    if (cats.size() == 0)
      return dogs.peek();

    Cat oldestCat = cats.peek();
    Dog oldestDog = dogs.peek();
    if (oldestCat.isOlderThan(oldestDog))
      return oldestCat;
    else
      return oldestDog;
  }

  public Dog dequeueDog() {
    dogs.poll();
  }

  public Cat dequeueCat() {
    cats.poll();
  }
}

public class Dog extends Animal {
  public Dog(String n) { super(n); }
}

public class Cat extends Animal {
  public Cat(String n) { super(n); }
}
