import java.util.*;
import java.io.*;

public class BuildOrder {
  public static int[] visited;
  public static int[][] matrix;
  public static LinkedList<Integer> out;

  public static void dfs(int u, int V) {
    if (visited[u] == 0) {
      visited[u] = 1;
      for (int i = 0; i < V; i++) {
        if (matrix[u][i] == 1 && visited[i] == 0)
          dfs(i, V);
      }
      out.addFirst(u);
    }
  }

  public static List<Integer> build(int[] projects, int[][] dependencies, int V, int E) {
    out = new LinkedList<Integer>();
    visited = new int[V];
    Arrays.fill(visited, 0);
    matrix = new int[V][V];
    for (int i = 0; i < V; i++)
      Arrays.fill(matrix[i], 0);
    for (int i = 0; i < E; i++) {
      int edge1 = dependencies[i][0];
      int edge2 = dependencies[i][1];
      matrix[edge2][edge1] = 1; 
    }
    for (int i = 0; i < V; i++) {
      if (visited[i] == 0)
        dfs(i, V);
    }
    return out;
  }
  public static void main(String[] args) {
    int[] projects1 = new int[]{1, 2, 3, 4, 5, 6};
    int[][] dependencies1 = new int[][]{{3, 0}, {1, 5}, {3, 1}, {0, 5}, {2, 3}};
    int V = 6;
    int E = 5;
    List<Integer> list = build(projects1, dependencies1, V, E);
    for (int i = 0; i < V; i++) {
      System.out.print(projects1[list.get(i)]);
      if (i < V - 1)
        System.out.print(" ");
    }
  }
}
