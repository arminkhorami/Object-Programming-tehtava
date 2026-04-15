public class Worker implements Runnable {
    private SafeList<String> list;
    private int id;

    public Worker(SafeList<String> list, int id) {
        this.list = list;
        this.id = id;
    }

    public void run() {
        list.add("Item from thread " + id);
        list.add("Another item from thread " + id);
        list.remove(0);
    }
}