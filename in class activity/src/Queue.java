import java.util.ArrayList;

public class Queue<T> {
    //T storage = new T[10];
    private ArrayList<T> storage = new ArrayList<>();
    
    public void enqueue(T el) {
        storage.add(el);
    }
    
    public T dequeue() {
        if (isEmpty())
            return null;
        else return storage.remove(0);
    }
    
    public T firstEl() {
        if (isEmpty())
            return null;
        else return storage.get(0);
    }
    
    public void clear() {
        storage.clear();
    }
    
    public boolean isEmpty() {
        return storage.isEmpty();
    }
    
    public String toString() {
        return storage.toString();
    }
}