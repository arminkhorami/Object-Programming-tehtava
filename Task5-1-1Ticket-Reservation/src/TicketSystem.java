public class TicketSystem {
    private int availableSeats;

    public TicketSystem(int seats) {
        this.availableSeats = seats;
    }

    public synchronized boolean reserve(int customerId, int tickets) {
        if (tickets <= availableSeats) {
            availableSeats -= tickets;
            System.out.println("Customer " + customerId +
                    " reserved " + tickets + " tickets.");
            return true;
        } else {
            System.out.println("Customer " + customerId +
                    " couldn't reserve " + tickets + " tickets.");
            return false;
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}