import java.util.*;
import java.util.HashMap;

public class TestGraph {
    public static void main(String[] args) {
        HashMap<Graph.GraphNode, ArrayList<Graph.GraphNode>> adjMap = new HashMap<>();
        // Initialize the adjacency map with nodes labelled 0, 1, and 2.
        ArrayList<Graph.GraphNode> myNodes = new ArrayList<>();
        myNodes.add(new Graph.GraphNode(0));
        myNodes.add(new Graph.GraphNode(1));
        myNodes.add(new Graph.GraphNode(2));
        for (int i = 0; i < 3; i++) {
            int index = (i + 1) % 3;
            ArrayList<Graph.GraphNode> neighbors = new ArrayList<>();
            neighbors.add(myNodes.get(index));
            adjMap.put(myNodes.get(i), neighbors);
        }
        // Make the graph using these values
        Graph graph = new Graph(adjMap, 3, 3);
        // Check the contents of this Graph now.
        System.out.println(graph);

        // After out graph is set up, we need to run BFS on it.
        Graph.GraphNode startNode = graph.getNode(0);
        HashSet<Graph.GraphNode> visited = new HashSet<Graph.GraphNode>();

        // Running BFS...
        Graph.BreadthFirstSearch(startNode, graph, visited);

        System.out.println();
        visited.clear();

        // Running DFS...
        Graph.DepthFirstSearch(startNode, graph, visited);

        System.out.println();
        visited.clear();

        // Running Recursive DFS...
        Graph.DFSRecursive(startNode, graph, visited);
    }
}
