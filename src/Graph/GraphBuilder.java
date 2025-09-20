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

        nodeA.addNeighbor(nodeB);
        nodeA.addNeighbor(nodeC);

        nodeB.addNeighbor(nodeA);
        nodeB.addNeighbor(nodeD);
        nodeB.addNeighbor(nodeE);

        nodeC.addNeighbor(nodeA);
        nodeC.addNeighbor(nodeF);

        nodeD.addNeighbor(nodeB);

        nodeE.addNeighbor(nodeB);
        nodeE.addNeighbor(nodeF);

        nodeF.addNeighbor(nodeC);
        nodeF.addNeighbor(nodeE);

        return nodeA; // root node
    }
}