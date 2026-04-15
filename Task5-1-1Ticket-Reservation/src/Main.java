public class Main {
    public static void main(String[] args) {

        TicketSystem system = new TicketSystem(20);

        Thread[] customers = new Thread[15];

        for (int i = 0; i < 15; i++) {
            customers[i] = new Thread(new Customer(system, i + 1));
            customers[i].start();
        }

        for (int i = 0; i < 15; i++) {
            try {
                customers[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Remaining seats: " + system.getAvailableSeats());
    }
}