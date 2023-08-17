package Graphs;

import java.util.*;

public class BFS {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[0].add(new Edge(1, 3));
        graph[0].add(new Edge(1, 0));

        graph[0].add(new Edge(2, 4));
        graph[0].add(new Edge(2, 0));

        graph[0].add(new Edge(3, 1));
        graph[0].add(new Edge(3, 5));
        graph[0].add(new Edge(3, 4));

        graph[0].add(new Edge(4, 2));
        graph[0].add(new Edge(4, 5));
        graph[0].add(new Edge(4, 3));

        graph[0].add(new Edge(5, 3));
        graph[0].add(new Edge(5, 4));
        graph[0].add(new Edge(5, 6));
    }

    public static void BFS(ArrayList<Edge> graph[], int V) {
        // Create a queue for BFS traversal
        Queue<Integer> q = new LinkedList<>();

        // Create a boolean array to track visited vertices
        boolean vis[] = new boolean[V];

        // Start BFS traversal from vertex 0
        q.add(0);

        // Perform BFS traversal
        while (!q.isEmpty()) {
            // Get the current vertex from the front of the queue
            int curr = q.remove();

            // If the current vertex is not visited
            if (vis[curr] == false) {
                // Print the current vertex
                System.out.print(curr + " ");

                // Mark the current vertex as visited
                vis[curr] = true;

                // Traverse through the adjacency list of the current vertex
                for (int i = 0; i < graph[curr].size(); i++) {
                    // Get the edge information
                    Edge e = graph[curr].get(i);

                    // Add the destination vertex of the edge to the queue for traversal
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        BFS(graph, v);

        //            1-----3
        //           /      | \
        //          /       |   \
        //         0        |    5-------6
        //          \       |  /
        //            \     | /
        //              2---4

    }
}
