import java.io.*;
import java.util.*;

public class Graph {
    private static final String NEWLINE = System.getProperty("line.separator");
    public int V;
    public Bag<Integer>[] adj;

    public Graph(int V){
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++){
            adj[v] = new Bag<Integer>();
        }
    }

    public void addE(int v,int w){
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }

   

    

}

