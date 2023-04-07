import java.util.*;
import java.io.*;


public class breadthFirst {
    public boolean[] marked;
    public int[] edgeTo;
    public int[] distTo;

    public breadthFirst(Graph G, int s,int tar,int time){
        marked = new boolean[G.V];
        edgeTo = new int[G.V];
        distTo = new int[G.V];
        Arrays.fill(marked, false);
        bfs(G,s,tar);
    }

    public void bfs(Graph G, int s,int tar){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(s);
        marked[s] = true;
        distTo[s] = 0;
        while(!q.isEmpty()){
            int v = q.poll();
            for(int w : G.adj(v)){
                if(!marked[w]){
                    edgeTo[w] = v;
                    G.time += 5;
                    distTo[w] = distTo[v] + 1;
                    marked[w] = true;
                    if (w == tar) return;
                    q.offer(w);
                }
            }
        }
        










    }

    
    
}
