package Graph;

public class Main {
    public static void main(String[] args){
//        Graph graph = new Graph();
//
//        var A = graph.createNode("A");
//        var B = graph.createNode("B");
//        var C = graph.createNode("C");
//        var D = graph.createNode("D");
//        var E = graph.createNode("E");
//        var F = graph.createNode("F");

//        graph.createConnection(A,B, Graph.GRAPH_DIRECTION.DIRECTED);
//        graph.createConnection(A,C, Graph.GRAPH_DIRECTION.DIRECTED);
//        graph.createConnection(A,D, Graph.GRAPH_DIRECTION.DIRECTED);
//        graph.createConnection(C,E, Graph.GRAPH_DIRECTION.DIRECTED);
//        graph.createConnection(C,F, Graph.GRAPH_DIRECTION.DIRECTED);
//        graph.createConnection(D,F, Graph.GRAPH_DIRECTION.DIRECTED);


//        graph.createConnection(A,B, Graph.GRAPH_DIRECTION.DIRECTED);
//        graph.createConnection(B,C, Graph.GRAPH_DIRECTION.DIRECTED);
//        graph.createConnection(C,D, Graph.GRAPH_DIRECTION.DIRECTED);
//        graph.createConnection(D,A, Graph.GRAPH_DIRECTION.DIRECTED);
//
//        System.out.println(graph);
//
//        System.out.println(graph.getBFS(A));
//
//        System.out.println(graph.getDFS(A));
//
//        System.out.println(graph.hasCycle());

        DirectedWeightedGraph wGraph = new DirectedWeightedGraph();

        var A = wGraph.createNode("A");
        var B = wGraph.createNode("B");
        var C = wGraph.createNode("C");

        wGraph.createConnection(A,B,5);
        wGraph.createConnection(A,C,10);
        wGraph.createConnection(B,C,5);

        System.out.println(wGraph);
    }
}
