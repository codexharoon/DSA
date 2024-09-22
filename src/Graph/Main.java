package Graph;

public class Main {
    public static void main(String[] args){
        Graph graph = new Graph();

        var A = graph.createNode("A");
        var B = graph.createNode("B");
        var C = graph.createNode("C");
        var D = graph.createNode("D");

        graph.createConnection(A,B, Graph.GRAPH_DIRECTION.UNDIRECTED);
        graph.createConnection(A,C, Graph.GRAPH_DIRECTION.UNDIRECTED);
        graph.createConnection(C,D, Graph.GRAPH_DIRECTION.UNDIRECTED);

        System.out.println(graph);
    }
}
