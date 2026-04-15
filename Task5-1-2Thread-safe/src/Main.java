public class Main {
    public static void main(String[] args) {

        SafeList<String> list = new SafeList<>();

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Worker(list, i));
            threads[i].start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final size: " + list.size());
        list.printAll();
    }
}