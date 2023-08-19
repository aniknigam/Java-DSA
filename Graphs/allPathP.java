package Graphs;

import java.util.ArrayList;

import Arraylist.ArraylistP2;

public class allPathP {
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

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 3));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
    }

    public static void allPath(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int target) {
        // base case
        if (curr == target) {
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // vis[e.dest] == false
            if (!vis[e.dest]) {
                vis[curr] = true;
                allPath(graph, vis, e.dest, path + e.dest, target);
                vis[e.dest] = false;
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        int target = 5;
        int source = 0;
        allPath(graph, new boolean[v], source, "0", target);

        // 1-----3
        // / | \
        // / | \
        // 0 | 5-------6
        // \ | /
        // \ | /
        // 2---4

    }
}
