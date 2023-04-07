import java.util.*;
import java.io.*;

public class Bag<Item> implements Iterable<Item> {
    public Node<Item> first;
    public int n;
    
    
    public static class Node<Item> {
            public Item item;
            public Node<Item> next;
            
    }

    public Bag(){
        first = null;
        n = 0;
        
        
    }
    public int size() {
        return n;
    }
    

    public void add(Item item){
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public Iterator<Item> iterator()  {
        return new LinkedIterator(first);
    }

    public class LinkedIterator implements Iterator<Item> {
        public Node<Item> current;

        public LinkedIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  {
            return current != null;
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
    
}