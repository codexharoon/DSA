package Graph;

import java.util.*;

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


    public List<Node> getBFS(Node start){
        Queue<Node> q = new LinkedList<>();
        Set<Node> visited = new HashSet<>();

        List<Node> result  = new ArrayList<>();

        q.add(start);
        visited.add(start);

        while(!q.isEmpty()){
            Node ele = q.poll();

            result.add(ele);

            for(Node child : this.list.get(ele)){
                if(!visited.contains(child)){
                    q.add(child);
                    visited.add(child);
                }
            }
        }

        return result;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(var entry : list.entrySet()){
            sb.append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
        }

        return sb.toString();
    }
}
