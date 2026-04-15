import java.util.Random;

public class Customer implements Runnable {
    private TicketSystem system;
    private int id;
    private Random random = new Random();

    public Customer(TicketSystem system, int id) {
        this.system = system;
        this.id = id;
    }

    public void run() {
        int tickets = random.nextInt(4) + 1; // 1 تا 4 بلیت
        system.reserve(id, tickets);
    }
}