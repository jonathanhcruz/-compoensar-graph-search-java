package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import Graph.Node.Node;

import java.util.stream.Collectors;

public class BFS {
    public static List<Integer> traverse(Node startNode) {
        List<Integer> result = new ArrayList<>();
        if (startNode == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();

        System.out.println("BFS started from node " + startNode.getValue() + ".");
        System.out.println("------------------------------------------");

        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            String queueStatus = queue.stream().map(n -> String.valueOf(n.getValue())).collect(Collectors.joining(", "));
            System.out.println("Queue status: [" + queueStatus + "]");

            Node currentNode = queue.poll();
            System.out.println("-> Visiting the node: " + currentNode.getValue());
            result.add(currentNode.getValue());

            System.out.print("   Adding unvisited neighbors to the queue: ");
            boolean addedNeighbor = false;
            for (Node neighbor : currentNode.getChildren()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                    System.out.print(neighbor.getValue() + " ");
                    addedNeighbor = true;
                }
            }
            if (!addedNeighbor) {
                System.out.print("none.");
            }
            System.out.println("\n");
        }

        System.out.println("------------------------------------------");
        System.out.println("BFS finished.");
        return result;
    }
}