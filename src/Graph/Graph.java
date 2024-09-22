package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private class Node{
        public String value;

        public Node(String value){
            this.value = value;
        }

        public String toString(){
            return this.value;
        }
    }

    enum GRAPH_DIRECTION{
        DIRECTED,
        UNDIRECTED,
    }

    private Map<Node, List<Node>> list;
    private Map<String,Node> nodes;

    public Graph(){
        list = new HashMap<>();
        nodes = new HashMap<>();
    }

    public Node createNode(String value){
        if(!nodes.containsKey(value)){
            nodes.put(value,new Node(value));
        }

        return nodes.get(value);
    }

    public void createConnection(Node from, Node to, GRAPH_DIRECTION direction){
        if(!list.containsKey(from)){
            list.put(from,new ArrayList<>());
        }

        if(!list.containsKey(to)){
            list.put(to,new ArrayList<>());
        }

        list.get(from).add(to);

        if(direction == GRAPH_DIRECTION.UNDIRECTED){
            list.get(to).add(from);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(var entry : list.entrySet()){
            sb.append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
        }

        return sb.toString();
    }
}
