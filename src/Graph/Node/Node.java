package Graph.Node;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private int value;
    private List<Node> Children = new LinkedList<>();

    public Node(int value) {
        this.value = value;
    }

    // getters
    public int getValue() {
        return this.value;
    }

    public List<Node> getChildren() {
        return this.Children;
    }

    // setter
    public void setChildren(Node child) {
        this.Children.add(child);
    }
}