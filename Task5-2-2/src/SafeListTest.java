import java.util.ArrayList;
import java.util.List;

class SafeList {
    private List<String> list = new ArrayList<>();

    public synchronized void add(String item) {
        list.add(item);
    }

    public synchronized void remove(String item) {
        list.remove(item);
    }

    public synchronized int size() {
        return list.size();
    }
}

class ListWorker implements Runnable {
    private SafeList safeList;
    private int id;

    public ListWorker(SafeList list, int id) {
        this.safeList = list;
        this.id = id;
    }

    @Override
    public void run() {
        String item = "Item-" + id;

        safeList.add(item);
        System.out.println("Added: " + item);

        if (Math.random() > 0.5) {
            safeList.remove(item);
            System.out.println("Removed: " + item);
        }

        System.out.println("Current size: " + safeList.size());
    }
}

public class SafeListTest {
    public static void main(String[] args) {

        SafeList safeList = new SafeList();

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new ListWorker(safeList, i));
        }

        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final size: " + safeList.size());
    }
}