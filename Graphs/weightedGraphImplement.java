package Graphs;

import java.util.ArrayList;

public class weightedGraphImplement {

    static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2, 10));

        graph[1].add(new Edge(1, 2, 12));
        graph[1].add(new Edge(1, 3, 13));

        graph[2].add(new Edge(2, 0, -1));
        graph[2].add(new Edge(2, 1, -15));
        graph[2].add(new Edge(2, 3, 100));

        graph[3].add(new Edge(3, 1, 15));
        graph[3].add(new Edge(3, 2, 10));

    }

    public static void main(String[] args) {
        int v = 4;

        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        // printing the neighbout and weight
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println("Destination: " + e.dest + ", Weight: " + e.weight);
        }

    }
}
