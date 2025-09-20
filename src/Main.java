import java.util.List;

import Graph.Node.Node;
import Graph.GraphBuilder;
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
    }
}