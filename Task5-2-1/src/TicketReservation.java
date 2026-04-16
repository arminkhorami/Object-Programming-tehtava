class Theater {
    private int availableSeats;

    public Theater(int seats) {
        this.availableSeats = seats;
    }

    public synchronized boolean reserveSeats(int seats, int customerId) {
        if (availableSeats >= seats) {
            System.out.println("Customer " + customerId + " reserved " + seats + " tickets.");
            availableSeats -= seats;
            return true;
        } else {
            System.out.println("Customer " + customerId + " couldn't reserve " + seats + " tickets.");
            return false;
        }
    }
}

class Customer implements Runnable {
    private Theater theater;
    private int seatsToReserve;
    private int customerId;

    public Customer(Theater theater, int seats, int id) {
        this.theater = theater;
        this.seatsToReserve = seats;
        this.customerId = id;
    }

    @Override
    public void run() {
        theater.reserveSeats(seatsToReserve, customerId);
    }
}

public class TicketReservation {
    public static void main(String[] args) {

        Theater theater = new Theater(10);

        Thread[] customers = new Thread[15];

        for (int i = 0; i < 15; i++) {
            int seats = (int)(Math.random() * 4) + 1;
            customers[i] = new Thread(new Customer(theater, seats, i + 1));
        }

        for (Thread t : customers) {
            t.start();
        }

        for (Thread t : customers) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Reservation finished.");
    }
}