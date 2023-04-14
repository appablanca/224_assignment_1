    //-----------------------------------------------------
    // Title: Main
    // Author: Feyzi Eren Gündoğdu
    // ID: 52417418978
    // Section: 1
    // Assignment: 1
    // Description: This is the main class that uses other classes to solve the problem.
    //-----------------------------------------------
import java.util.*;
public class main {
    public static void Main(String[] args) throws Exception {
        
        int N,M,T,C;   //defining variables
        Scanner sc = new Scanner(System.in); 
        N = sc.nextInt();   //taking inputs in-order as the question requires 
        M = sc.nextInt();
        T = sc.nextInt();
        C = sc.nextInt(); 
        sc.nextLine();
    
        Graph graph = new Graph(N+1);   //creating a graph with N+1 vertices
        for(int i = 0; i < M; i++){     //adding edges to the graph
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.addE(a,b);
            sc.nextLine();
        }

        int start = sc.nextInt();   //taking the start and end points
        int end = sc.nextInt();
        

        Dijkstra dijkstra = new Dijkstra(graph,start,end);  //creating a djikstra search to find the shortest path between start and end
        System.out.println(dijkstra.distTo(end)+1); //printing the length of the path 
        dijkstra.thePath(end);  //printing the path
        System.out.println();



        




        graph.time = (C*dijkstra.distTo(end));  //calculating the time by multiplying the cost of the path with the length of the path
        int weirdTime = ((graph.time)%T)*(dijkstra.distTo(end)-1); //adding extra time by multiplying (time)mod(T) with the length of the path -1
        graph.time += weirdTime; // adding extra time to time
        System.out.println(graph.getTime()); //printing the time
        
        
        



































        sc.close();
    }
}