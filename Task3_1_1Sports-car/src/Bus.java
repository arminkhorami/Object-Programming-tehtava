public class Bus extends Car {

    private int passengers = 0;
    private int maxPassengers = 40;

    public void passengerEnter() {
        if (passengers < maxPassengers) {
            passengers++;
        }
    }

    public void passengerExit() {
        if (passengers > 0) {
            passengers--;
        }
    }

    public void showPassengers() {
        System.out.println("Passengers: " + passengers);
    }
}