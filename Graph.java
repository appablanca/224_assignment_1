import java.util.*;

public class Graph {
    public int V;
    public Bag<Integer>[] adj;
    public int time;

    public Graph (int V) {
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
        time = 0;
    }

    

    public void addE(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int getTime() {
        return time;
    }

    public int V() {
        return V;
    }

    
    

    







    










    public class Bag<Item> implements Iterable<Item> {

        public Node first;
        public int N;

        public class Node {
            Item item;
            Node next;
            
        }

        public boolean isEmpty() {
            return first == null;
        }

        public int size() {
            return N;
        }

        public void add(Item item) {
            Node oldfirst = first;
            first = new Node();
            first.item = item;
            first.next = oldfirst;
            N++;
        }

        public Iterator<Item> iterator() {
            return new ListIterator();
        }

        public class ListIterator implements Iterator<Item> {
            public Node current = first;
            public boolean hasNext() {
                return current != null;
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
            public Item next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Item item = current.item;
                current = current.next;
                return item;
            }
        }

        public String toString() {
            String s = "";
            for (Item item : this) {
                s += item + " ";
            }
            return s;
        }
    }























   
}
