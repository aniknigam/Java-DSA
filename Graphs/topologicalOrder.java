package Graphs;

import java.util.*;

public class topologicalOrder {
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

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void topologicalUtil(ArrayList<Edge> graph[], boolean vis[], int curr, Stack<Integer> topo) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topologicalUtil(graph, vis, e.dest, topo);
            }
        }

        topo.push(curr);
    }

    public static void toposort(ArrayList<Edge> graph[], int V) {
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topologicalUtil(graph, vis, i, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        toposort(graph, v);
    }
}
