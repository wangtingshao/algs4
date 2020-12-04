package com.graph;

import utils.In;

import java.util.LinkedList;
import java.util.Queue;

public class BroadFirstPaths {

    int V;
    int E;
    boolean[] marked;
    int[] edgeTo;
    int s;
    BroadFirstPaths(In in, int s) {
        V = in.readInt();
        E = in.readInt();
        this.s = s;

        marked = new boolean[V];

    }

    void bfs(Graph g, int s) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
    }


}
