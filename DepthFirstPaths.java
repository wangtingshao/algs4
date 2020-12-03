package com.graph;

import utils.In;

import java.io.FileNotFoundException;
import java.util.Stack;

public class DepthFirstPaths {


    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    public Graph graph;

    public DepthFirstPaths(int s) throws FileNotFoundException {
        graph = new Graph(new In("test.txt"));
        marked = new boolean[graph.V()];
        edgeTo = new int[graph.V()];
        this.s = s;
        dfs(graph, s);
    }

    private void dfs(Graph g, int v) {
        marked[v] = true;
        for(Integer i : g.adj(v)) {
            if (!marked[i]) {
                edgeTo[i] = v;
                dfs(g, i);
            }
        }
    }

    public Iterable<Integer> pathTo(int v) {
        Stack<Integer> stack = new Stack<>();
        if (marked[v]) {
            for (int i = v; i != s ; i = edgeTo[i]) {
                stack.push(i);
            }
            stack.push(s);
        }

        return stack;
    }

    public static String showPath(Stack<Integer> paths) {
        StringBuilder stringBuilder = new StringBuilder();
        while (!paths.empty()) {
            stringBuilder.append(paths.pop()).append("-");
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) throws FileNotFoundException {

        DepthFirstPaths depthFirstPaths = new DepthFirstPaths(0);
        for (int i = 0; i < depthFirstPaths.graph.V(); i++) {
            System.out.println(showPath((Stack<Integer>) depthFirstPaths.pathTo(i)));
        }

    }


}
