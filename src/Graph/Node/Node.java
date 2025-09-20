package Graph.Node;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private int value;
    private Node left;
    private Node right;
    private List<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.neighbors = new ArrayList<>();
    }

    // getters
    public int getValue() {
        return this.value;
    }
    public Node getLeft() {
        return this.left;
    }
    public Node getRight() {
        return this.right;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    // setters
    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void addNeighbor(Node neighbor) {
        this.neighbors.add(neighbor);
    }
}