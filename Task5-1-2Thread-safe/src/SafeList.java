import java.util.ArrayList;

public class SafeList<T> {
    private ArrayList<T> list = new ArrayList<>();

    public synchronized void add(T item) {
        list.add(item);
    }

    public synchronized T remove(int index) {
        return list.remove(index);
    }

    public synchronized int size() {
        return list.size();
    }

    public synchronized void printAll() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}