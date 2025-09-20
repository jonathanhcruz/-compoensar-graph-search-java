package Graph;

import Graph.Node.Node;

public class GraphBuilder {
    public static Node buildSimpleGraph() {
        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        Node nodeE = new Node(5);
        Node nodeF = new Node(6);

        nodeA.neighbors.add(nodeB);
        nodeA.neighbors.add(nodeC);

        nodeB.neighbors.add(nodeA);
        nodeB.neighbors.add(nodeD);
        nodeB.neighbors.add(nodeE);

        nodeC.neighbors.add(nodeA);
        nodeC.neighbors.add(nodeF);

        nodeD.neighbors.add(nodeB);

        nodeE.neighbors.add(nodeB);
        nodeE.neighbors.add(nodeF);

        nodeF.neighbors.add(nodeC);
        nodeF.neighbors.add(nodeE);

        return nodeA; // root node
    }
}