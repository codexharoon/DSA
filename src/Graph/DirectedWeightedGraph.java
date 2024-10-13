package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
    String label;
    List<WeightedEdge> edges;

    public Node(String label){
        this.label = label;
        edges = new ArrayList<>();
    }

    public void addEdge(Node node,int weight){
        edges.add(new WeightedEdge(node,weight));
    }

    public List<WeightedEdge> getChildren(){
        return this.edges;
    }

    public String toString(){
        return this.label;
    }
}

class WeightedEdge {
    Node node;
    int weight;

    public WeightedEdge(Node node){
        this.node = node;
        this.weight = 0;
    }

    public WeightedEdge(Node node , int weight){
        this.node = node;
        this.weight = weight;
    }

}
public class DirectedWeightedGraph {
    private Map<String,Node> nodes;

    public DirectedWeightedGraph(){
        this.nodes = new HashMap<>();
    }

    public Node createNode(String label){
        if(!nodes.containsKey(label)){
            nodes.put(label,new Node(label));
        }

        return nodes.get(label);
    }

    public void createConnection(Node from,Node to,int weight){
        from.addEdge(to,weight);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(var entry : nodes.entrySet()){
            for(var child : entry.getValue().edges){
                sb.append(entry.getKey()).append(" -- ").append(child.weight).append(" --> ").append(child.node).append("\n");
            }
        }

        return sb.toString();
    }
}
