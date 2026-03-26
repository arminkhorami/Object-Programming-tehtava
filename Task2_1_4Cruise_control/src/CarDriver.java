public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla");

        myCar.fillTank();

        boolean ok = myCar.turnOnCruise(100);

        if (ok) {
            System.out.println("Cruise ON at " + myCar.getTargetSpeed());
        } else {
            System.out.println("Cruise failed");
        }

        myCar.turnOffCruise();
        System.out.println("Cruise OFF");
    }
}