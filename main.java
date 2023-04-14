
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
        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.addE(a,b);
            sc.nextLine();
        }

        int start = sc.nextInt();
        int end = sc.nextInt();
        

        DijkstraSP dijkstra = new DijkstraSP(graph,start,end);
        System.out.println(dijkstra.distTo(end)+1);
        dijkstra.thePath(end);
        System.out.println();



        




        graph.time = (C*dijkstra.distTo(end));
        int weirdTime = ((graph.time)%T)*(dijkstra.distTo(end)-1);
        graph.time += weirdTime;
        System.out.println(graph.getTime());
        
        
        



































        
    }
}