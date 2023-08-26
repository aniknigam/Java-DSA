package Graphs;

import java.util.*;

public class dijkstra {

    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    // we are implementing the comparable interface to make sure that we are
    // comparing on the basis of distance
    static class Pair implements Comparable<Pair> {
        int node;// targeted node
        int dist;// distance to the targeted node

        Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair p2) {// compareTo is a funtion in the interface which we will override to sort the
            return this.dist - p2.dist;// we are sorting in ascending order
            // if we want in descending order then
            // return p2.dist - this.dist
        }

    }

    public static void dijkstra(ArrayList<Edge> graph[], int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        int distance[] = new int[V];
        // initialize the value to infinity in a distance array because we dont yet no
        // the shortest distance yet
        for (int i = 0; i < V; i++) {
            if (i != src) {
                distance[i] = Integer.MAX_VALUE; // this means infinity in java
            }
        }
        boolean vis[] = new boolean[V];

        // add first node in queue with its distance to itself
        pq.add(new Pair(0, 0));

        // bfs code
        while (!pq.isEmpty()) {
            Pair curr = pq.remove(); // shortest
            if (!vis[curr.node]) {
                vis[curr.node] = true;

                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if (distance[u] + e.wt < distance[v]) {// this is relaxation concept
                        distance[v] = distance[u] + e.wt;
                        pq.add(new Pair(v, distance[v]));
                    }
                }
            }
        }

        for (int i = 0; i < V; i++) {
            System.out.print(distance[i] + " ");
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        dijkstra(graph, 0, V);
    }

}