import java.util.*;

public class ShortestPath {
    public int[] distTo;
    public int[] edgeTo;
    public boolean[] marked;
    public PriorityQueue<Node> pq;
    
    public class Node implements Comparable<Node> {
        public final int v;
        public final int dist;
        
        public Node(int v, int dist) {
            this.v = v;
            this.dist = dist;
        }
        
        public int compareTo(Node other) {
            return Integer.compare(this.dist, other.dist);
        }
    }
    
    public ShortestPath(Graph G, int s, int t) {
        distTo = new int[G.V];
        edgeTo = new int[G.V];
        marked = new boolean[G.V];
        pq = new PriorityQueue<Node>();
        
        for (int v = 0; v < G.V; v++) {
            distTo[v] = Integer.MAX_VALUE;
        }
        distTo[s] = 0;
        
        pq.offer(new Node(s, 0));
        while (!pq.isEmpty()) {
            int v = pq.poll().v;
            if (v == t) {
                break;
            }
            if (marked[v]) {
                continue;
            }
            marked[v] = true;
            for (int w : G.adj(v)) {
                int dist = distTo[v] + 1; // assuming unit weights
                if (dist < distTo[w]) {
                    distTo[w] = dist;
                    edgeTo[w] = v;
                    pq.offer(new Node(w, dist));
                }
            }
        }
    }
    
    public boolean hasPathTo(int v) {
        return marked[v];
    }
    
    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != 0; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(0);
        return path;
    }
}