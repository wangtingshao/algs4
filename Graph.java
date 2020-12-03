package com.graph;

import utils.In;

import java.io.FileNotFoundException;

public class Graph {

    private final int V;
    private int E;
    private Bag[] adj;
    Graph(int V){
        this.V = V;
    }

    Graph(In in) {
        V = in.readInt();
        E = in.readInt();
        adj = new Bag[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new Bag<>();
        }
        for (int i = 0; i < E; i++) {
            adj[in.readInt()].add(in.readInt());
        }
    }

    int V(){
        return V;
    }

    int E(){
        return 0;
    }

    Iterable<Integer> adj(int v){
        return adj[v];
    }



    public static void main(String[] args) throws FileNotFoundException {
        Graph graph = new Graph(new In("test.txt"));
    }




}
