
import java.util.*;
public class main {
    public static void main(String[] args) throws Exception {
        
        int N,M,T,C;   
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        T = sc.nextInt();
        C = sc.nextInt(); 
        sc.nextLine();
    
        Graph graph = new Graph(N+1);
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.addE(a,b);
            sc.nextLine();
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        depthFirst dfs = new depthFirst(graph,start,end,C);
        for(int v = 0;v<graph.V;v++){
            for(int w : graph.adj(v)){
                System.out.println(v+"-"+w);
            }
        }

        
        
    
        
        System.out.println(graph.getTime());
        
        
        



































        
    }
}