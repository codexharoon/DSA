package Graph;

import java.util.*;

public class GFG {

    private Map<Integer, List<int[]>> getAdj (int[][] edges){
        Map<Integer, List<int[]>> adj = new HashMap<>();

        for(int [] edge : edges){
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];

            adj.putIfAbsent(from,new ArrayList<>());
            adj.get(from).add(new int[]{to,weight});
        }

        return adj;
    }


    private void getTopologicalSortRec(int node ,Set<Integer> visited,Stack<Integer> stack,Map<Integer, List<int[]>> adj){
        if(visited.contains(node)) return;

        visited.add(node);

        if(adj.containsKey(node)){
            for(int [] child : adj.get(node)){
                getTopologicalSortRec(child[0],visited,stack,adj);
            }
        }

        stack.add(node);
    }

    private Stack<Integer> getTopologicalSort(Map<Integer, List<int[]>> adj){
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        for(var entry : adj.entrySet()){
            if(!visited.contains(entry.getKey()))
                getTopologicalSortRec(entry.getKey(),visited,stack,adj);
        }

        return stack;
    }

    public int[] shortestPath(int V, int E, int[][] edges) {
        Map<Integer, List<int[]>> adj = getAdj(edges);
        Stack<Integer> topologicalStack = getTopologicalSort(adj);

        int [] distances = new int[V];

        Arrays.fill(distances,Integer.MAX_VALUE);

        distances[0] = 0;

        while(!topologicalStack.isEmpty()){
            int top = topologicalStack.pop();

            if(!adj.containsKey(top)) continue;;

            for(var child: adj.get(top)){
                int newDistance = 0;

                if(distances[top] == Integer.MAX_VALUE){
                    distances[top] = -1;
                    newDistance = child[1];
                }
                else{
                    newDistance = distances[top] + child[1];
                }

                if(distances[top] != -1 && newDistance < distances[child[0]]){
                    distances[child[0]] = newDistance;
                }
            }
        }

        for(int i = 0 ; i < V ; i++){
            if(distances[i] == Integer.MAX_VALUE){
                distances[i] = -1;
            }
        }

        return distances;
    }
}
