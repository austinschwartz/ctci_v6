import java.util.*;

public class Node {
  public List<Node> adjacent;
  private String vertex;
  public enum State { Unvisited, Visited, Visiting }
  public State state;

  public Node(String vertex) {
    this.vertex = vertex;
    adjacent = new ArrayList<Node>();
  }
  public void addAdjacent(Node x) {
    adjacent.add(x);
  }
  public int adjacentCount() {
    return adjacent.size();
  }
}
