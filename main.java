import java.io.*; 
import java.util.*;
public class main {
    public static void main(String[] args) throws Exception {
        int M,N,T,C;
        int a,b;    
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        T = sc.nextInt();
        C = sc.nextInt(); 
        sc.nextLine();
        Graph graph = new Graph(N);
        
        for (int i = 0; i ==  N;i++  ){
            a = sc.nextInt();
            b = sc.nextInt();
            graph.addE(a, b);
            sc.nextLine();
        }

        graph.getTime();
        
        



































        sc.close();
    }
}