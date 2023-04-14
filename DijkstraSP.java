import java.util.*;

public class DijkstraSP {
    private int[] distTo;
    private int[] edgeTo;
    private boolean[] marked;

    public DijkstraSP(Graph G, int start,int end) {
        distTo = new int[G.V()];
        edgeTo = new int[G.V()];
        marked = new boolean[G.V()];
        
        for (int i = 0; i < G.V(); i++) {
            distTo[i] = Integer.MAX_VALUE;
        }
        
        distTo[start] = 0;
        edgeTo[start] = -1;
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(G.V(), new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                return Integer.compare(distTo[i], distTo[j]);
            }
        });
        
        pq.offer(start);
        
        while (!pq.isEmpty()) {
            int v = pq.poll();
            marked[v] = true;
            
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    if (w == end){
                        distTo[w] = distTo[v] + 1;
                        edgeTo[w] = v;
                        return;
                    }
                    if (distTo[w] > distTo[v] + 1) {
                        distTo[w] = distTo[v] + 1;
                        edgeTo[w] = v;
                        
                        if (pq.contains(w)) {
                            pq.remove(w);
                        }
                        
                        pq.offer(w);
                    }
                }
            }
        }
    }

    public int distTo(int v) {
        return distTo[v];
    }

    public boolean hasPathTo(int v) {
        return distTo[v] != Integer.MAX_VALUE;
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        
        Stack<Integer> path = new Stack<Integer>();
        
        for (int x = v; x != -1; x = edgeTo[x]) {
            path.push(x);
        }

        
        
        return path;
    }

    public void thePath(int v) {
        if (!hasPathTo(v)) {
            return;
        }
        
        Stack<Integer> path = new Stack<Integer>();
        
        for (int x = v; x != -1; x = edgeTo[x]) {
            path.push(x);
        }
        
        while (!path.isEmpty()) {
            System.out.print(path.pop() + " ");
        }
        
    }
}