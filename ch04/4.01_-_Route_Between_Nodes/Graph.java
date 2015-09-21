public class Graph {
  public Node vertices[];
  public int count;
  
  public Graph() {
    count = 0;
  }

  public void add(Node x) {
    vertices[count] = x;
    count++;
  }
}
