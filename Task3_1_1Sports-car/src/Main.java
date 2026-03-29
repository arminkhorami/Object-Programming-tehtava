public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus();

        bus.accelerate();
        bus.accelerate();

        bus.passengerEnter();
        bus.passengerEnter();
        bus.passengerEnter();

        bus.passengerExit();

        bus.show();
        bus.showPassengers();
    }
}