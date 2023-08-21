package Graphs;

import java.util.*;

public class cycleDirected {
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
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCycleDetected(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) {
                return true;
            } else if (!vis[e.dest]) {
                if (isCycleDetected(graph, e.dest, vis, stack)) {
                    return true;
                }
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int v = 4;

        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        System.out.println(isCycleDetected(graph, 0, new boolean[v], new boolean[v]));
    }

}
