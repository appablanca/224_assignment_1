import java.io.*; 
import java.util.*;
public class main {
    public static void main(String[] args) throws Exception {
        /*
        int M,N,T,C;
        int a,b;    
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        T = sc.nextInt();
        C = sc.nextInt(); 
        sc.nextLine();
        */
        Graph graph = new Graph(6);
        graph.addE(1, 2);
        graph.addE(1, 3);
        graph.addE(2, 4);
        graph.addE(1, 4);
        graph.addE(2, 5);
        breadthFirst.bfs(graph, 1, 5); 

        
        /*
        for (int i = 0; i ==  M*2;i++  ){
            System.out.println(i);
            a = sc.nextInt();
            b = sc.nextInt();
            graph.addE(a, b);
            sc.nextLine();
            
        }
        */
        System.out.println(graph.getTime());
        
        
        



































        
    }
}