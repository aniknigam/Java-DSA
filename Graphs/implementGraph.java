package Graphs;

import java.util.*;

public class implementGraph {

    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        // loop for removing the null value from every index and storing empty Arraylist
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // adding edges from source vertices to destination vertices
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

    }

    public static void main(String[] args) {
        int v = 4;
        // initializing a graph of array which is of arraylist type and store edges
        // every index of array contain arraylist
        ArrayList<Edge> graph[] = new ArrayList[v];

        // we will have to call the create graph function
        createGraph(graph);

        // print 2's neighbout
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }

    }
}
