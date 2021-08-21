package Graph;

import java.util.*;

public class GraphClass {

    private final Map<Vertex, List<Vertex>> adjVertices;

    public GraphClass() {
        adjVertices = new HashMap<>();
    }

    public Vertex addVertex(String label) {
        Vertex vertex = new Vertex(label);

        adjVertices.putIfAbsent(vertex, new ArrayList<>());

        return vertex;
    }

    public void addEdge(String label1, String label2) {
        Vertex vertex1 = new Vertex(label1);
        Vertex vertex2 = new Vertex(label2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }
    public void addEdge(String label1, String label2, int weight) {
        Vertex wVertex1 = new Vertex(label1, weight);
        Vertex wVertex2 = new Vertex(label2, weight);

        Vertex vertex1 = new Vertex(label1, weight);
        Vertex vertex2 = new Vertex(label2, weight);

        adjVertices.get(vertex1).add(wVertex2);
        adjVertices.get(vertex2).add(wVertex1);
    }

    public void removeVertex(String label) {
        Vertex vertex = new Vertex(label);
        adjVertices.values().forEach(list -> list.remove(vertex));
        adjVertices.remove(vertex);
    }

    public void removeEdge(String label1, String label2) {
        Vertex vertex1 = new Vertex(label1);
        Vertex vertex2 = new Vertex(label2);

        List<Vertex> edgeVertex1 = adjVertices.get(vertex1);
        List<Vertex> edgeVertex2 = adjVertices.get(vertex2);

        if (edgeVertex1 != null) {
            edgeVertex1.remove(vertex2);
        }
        if (edgeVertex2 != null) {
            edgeVertex2.remove(vertex1);
        }
    }

    public Set<Vertex> getVertices(){
        return adjVertices.keySet();
    }

    public List<Vertex> getNeighbors(String label){
        Vertex vertex = new Vertex(label);

        return adjVertices.get(vertex);
    }

    public Set<String> depthFirstTraverse(String root){
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            String vertex = stack.pop();
            if (!visited.contains(vertex)){
                visited.add(vertex);

                for (Vertex v: getNeighbors(vertex)) {
                    stack.push(v.label);
                }
            }
        }

        return visited;
    }

    public List<String> breadthTraverse(String root) throws Exception {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new Queue<>();
        List<String> nodes = new ArrayList<>();

        queue.enqueue(root);
        visited.add(root);

        while (!queue.isEmpty()){
            String vertex = queue.dequeue();
            nodes.add(vertex);
            for (Vertex v : getNeighbors(vertex)){
                if (!visited.contains(v.label)){
                    visited.add(v.label);
                    queue.enqueue(v.label);
                }
            }
        }
        return nodes;
    }

    public int size(){
        return adjVertices.size();
    }

    public String printGraph() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Vertex vertex : adjVertices.keySet()) {
            stringBuilder.append(vertex);
            stringBuilder.append(adjVertices.get(vertex));
        }
        return stringBuilder.toString();
    }

}
