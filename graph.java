import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}

class Vertex {
    int id;
    List<Edge> edges;

    public Vertex(int id) {
        this.id = id;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }
}

class Edge {
    Vertex source;
    Vertex destination;
    int weight;

    public Edge(Vertex source, Vertex destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

class Graph {
    List<Vertex> vertices;

    public Graph() {
        this.vertices = new ArrayList<>();
    }

    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
    }

    public void addEdge(Vertex source, Vertex destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        source.addEdge(edge);
        destination.addEdge(edge);
    }
}
 