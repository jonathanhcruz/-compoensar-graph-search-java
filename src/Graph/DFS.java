package Graph;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import Graph.Node.Node;

public class DFS {
    public static List<Integer> traverse(Node startNode) {
        List<Integer> result = new ArrayList<>();
        Set<Node> visited = new HashSet<>();
        dfsRecursive(startNode, result, visited);
        return result;
    }

    private static void dfsRecursive(Node node, List<Integer> result, Set<Node> visited) {
        if (node == null || visited.contains(node)) {
            return;
        }
        visited.add(node);
        result.add(node.getValue());
        for (Node neighbor : node.neighbors) {
            dfsRecursive(neighbor, result, visited);
        }
    }
}