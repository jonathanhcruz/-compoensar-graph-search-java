package Graph;

import java.util.*;
import java.util.stream.Collectors;

import Graph.Node.Node;

public class DFS {
    public static List<Integer> traverse(Node startNode) {
        List<Integer> result = new LinkedList<>();
        if (startNode == null) {
            return result;
        }

        Stack<Node> stack = new Stack<>(); // pila for DFS last-in-first-out
        Set<Node> visited = new HashSet<>();

        System.out.println("DFS started from node " + startNode.getValue() + ".");
        System.out.println("------------------------------------------");

        stack.push(startNode);
        visited.add(startNode);

        while (!stack.empty()) {
            String stackStatus = stack.stream().map(n -> String.valueOf(n.getValue())).collect(Collectors.joining(", "));
            System.out.println("Stack status: [" + stackStatus + "]");

            Node currentNode = stack.pop();
            System.out.println("-> Visiting the node: " + currentNode.getValue());
            result.add(currentNode.getValue());

            System.out.print("   Adding unvisited neighbors to the stack: ");
            boolean addedNeighbor = false;
            // Revertir la lista para asegurar un orden de salida consistente
            List<Node> children = new LinkedList<>(currentNode.getChildren());
            Collections.reverse(children);

            for (Node neighbor : children) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    stack.push(neighbor);
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
        System.out.println("DFS finished.");
        return result;
    }
}