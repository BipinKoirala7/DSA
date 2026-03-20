package Practice.Graphs;

public class Main {
  static void main() {
    Graph graph = new Graph();

    System.out.println("Add Vertex: " + graph.addVertex("A"));

    graph.printGraph();

    // Short Recursion example
    System.out.println("Factorial: " + getFactorial(5));

  }

  private static int getFactorial(int num){
    if(num == 1) return 1;
    return num * getFactorial(num - 1);
  }
}
