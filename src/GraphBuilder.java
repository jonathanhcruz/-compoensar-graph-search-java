import Graph.Node.Node;

public class GraphBuilder {
    public static Node buildSimpleGraph() {
        Node root = new Node(0);
        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        Node nodeE = new Node(5);
        Node nodeF = new Node(6);
        Node nodeG = new Node(7);
        Node nodeH = new Node(8);

        root.setChildren(nodeA);
        root.setChildren(nodeB);
        nodeA.setChildren(nodeB);
        nodeA.setChildren(root);
        nodeA.setChildren(nodeC);
        nodeA.setChildren(nodeD);
        nodeB.setChildren(root);
        nodeB.setChildren(nodeA);
        nodeB.setChildren(nodeE);
        nodeB.setChildren(nodeF);
        nodeC.setChildren(nodeA);
        nodeC.setChildren(nodeG);
        nodeD.setChildren(nodeA);
        nodeD.setChildren(nodeH);
        nodeE.setChildren(nodeB);
        nodeF.setChildren(nodeB);
        nodeG.setChildren(nodeC);
        nodeH.setChildren(nodeD);
        nodeH.setChildren(nodeF);

        return root;
    }
}