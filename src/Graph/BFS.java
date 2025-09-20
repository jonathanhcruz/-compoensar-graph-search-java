package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import Graph.Node.Node;

public class BFS {
    public static List<Integer> traverse(Node startNode) {
        List<Integer> result = new ArrayList<>();
        if (startNode == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();

        queue.add(startNode);
        visited.add(startNode);
        result.add(startNode.getValue());

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            for (Node neighbor : currentNode.getNeighbors()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                    result.add(neighbor.getValue());
                }
            }
        }
        return result;
    }
}