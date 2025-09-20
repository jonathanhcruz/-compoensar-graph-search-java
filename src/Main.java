import java.util.List;

import Graph.Node.Node;
import Graph.BFS;
import Graph.DFS;

public class Main {
    public static void main(String[] args) {
        // build a simple graph
        Node startNode = GraphBuilder.buildSimpleGraph();

        // Perform BFS and DFS traversals
        List<Integer> bfsResult = BFS.traverse(startNode);
        System.out.println("Recorrido en Amplitud (BFS): " + bfsResult);

        // Perform DFS traversal
        List<Integer> dfsResult = DFS.traverse(startNode);
        System.out.println("Recorrido en Profundidad (DFS): " + dfsResult);

        // Compare results
        System.out.println("Recorrido en Amplitud (BFS): " + bfsResult);
        System.out.println("Recorrido en Profundidad (DFS): " + dfsResult);

        // Expectative results
        // BFS expected: [0, 1, 2, 3, 4, 5, 6, 7, 8]
        // DFS expected: [0, 1, 3, 7, 4, 8, 6, 2, 5]
    }
}