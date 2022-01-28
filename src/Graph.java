import java.util.*;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    static class GraphNode {
        int value;

        GraphNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return Integer.toString(value);
        }
    }

    private Map<GraphNode, ArrayList<GraphNode>> adjacencyMap;
    private int V;
    private int E;

    public Graph(Map<GraphNode, ArrayList<GraphNode>> adjMap, int V, int E) {
        this.adjacencyMap = adjMap;
        this.V = V;
        this.E = E;
    }

    public Graph() {
        this.V = 0;
        this.E = 0;
        this.adjacencyMap = new HashMap<>();
    }

    public ArrayList<GraphNode> getNeighbors(GraphNode node) {
        return this.adjacencyMap.get(node);
    }

    /**
     * Use start node to traverse the graph using Breadth First Search. Print out all the
     * values in the order that we remove them from the queue / stack.
     * @param start The start node
     * @param graph The graph in question
     * @param visited The visited set
     */
    public static void BreadthFirstSearch(GraphNode start, Graph graph, HashSet<GraphNode> visited) {
        // TODO: Fill this in!
        Queue<GraphNode> myQueue = new LinkedList<>();
        myQueue.offer(start);
        while (!myQueue.isEmpty()) {
            GraphNode current = myQueue.poll();
            System.out.println(current);
            if (!visited.contains(current)) {
                visited.add(current);
            }
            for (GraphNode neighbor : graph.getNeighbors(current)) {
                if (!visited.contains(neighbor)) {
                    myQueue.offer(neighbor);
                }
            }
        }
    }

    /**
     * Use start node to traverse the graph using Depth First search. Print out all the
     * values in the order that we remove them from the queue / stack.
     * @param start The start node
     * @param graph The graph in question
     * @param visited The visited set
     */
    public static void DepthFirstSearch(GraphNode start, Graph graph, HashSet<GraphNode> visited) {
        // TODO: Fill this in!
        Stack<GraphNode> myStack = new Stack<>();
        myStack.push(start);
        while (!myStack.isEmpty()) {
            GraphNode current = myStack.pop();
            System.out.println(current);
            if (!visited.contains(current)) {
                visited.add(current);
            }
            for (GraphNode neighbor : graph.getNeighbors(current)) {
                if (!visited.contains(neighbor)) {
                    myStack.push(neighbor);
                }
            }
        }
    }

    /**
     * A recursive implementation of the DFS algorithm.
     * @param start The start node
     * @param graph The graph in question
     * @param visited The visited set
     */
    public static void DFSRecursive(GraphNode start, Graph graph, HashSet<GraphNode> visited) {
        if (visited.contains(start)) {
            return;
        }
        System.out.println(start);
        visited.add(start);
        for (GraphNode neighbor : graph.getNeighbors(start)) {
            DFSRecursive(neighbor, graph, visited);
        }
    }

    public GraphNode getNode(int value) {
        for (GraphNode node : this.adjacencyMap.keySet()) {
            if (node.value == value) {
                return node;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String s = "";
        for (GraphNode key : this.adjacencyMap.keySet()) {
            s += key.toString() + " = [";
            for (GraphNode value : this.adjacencyMap.get(key)) {
                s += value.toString() + ",";
            }
            s += "]\n";
        }
        return s;
    }
}
