import java.util.ArrayList;

public class Stack<T> {
    //T storage = new T[10];
    private ArrayList<T> storage = new ArrayList<>();
    
    public void push(T el) {
        storage.add(el);
    }
    
    public T pop() {
        if (isEmpty())
            return null;
        else return storage.remove(storage.size() - 1);
    }
    
    public T topEl() {
        if (isEmpty())
            return null;
        else return storage.get(storage.size() - 1);
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