public class depthFirst {
    public boolean[] marked;
    public int[] edgeTo;
    public int s;
    
    
    public depthFirst(Graph G, int s,int tar,int flightTime){
        marked = new boolean[G.V];
        edgeTo = new int[G.V];
        this.s = s;
        dfs(G,s,tar,flightTime);
    }

    public void dfs(Graph G, int v,int tar,int flightTime){
        marked[v] = true;
        for(int w : G.adj(v)){
            if(w == tar){
                 G.time += flightTime;
                 return;
            }
            else if(!marked[w]){
                G.time += flightTime;
                edgeTo[w] = v;
                dfs(G,w,tar,flightTime);
            }
        }
    }
}
