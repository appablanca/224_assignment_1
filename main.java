import java.io.*; 
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

        
        
    
        
        System.out.println(graph.getTime());
        
        
        



































        
    }
}