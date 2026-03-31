public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle moto = new Motorcycle();
        Vehicle bus = new Bus();
        ElectricVehicle eCar = new ElectricCar();

        System.out.println("\n--- Car ---");
        car.start();
        System.out.println(car.getInfo());
        System.out.println("Efficiency: " + car.calculateFuelEfficiency());

        System.out.println("\n--- Motorcycle ---");
        moto.start();
        System.out.println(moto.getInfo());
        System.out.println("Efficiency: " + moto.calculateFuelEfficiency());

        System.out.println("\n--- Bus ---");
        bus.start();
        System.out.println(bus.getInfo());
        System.out.println("Efficiency: " + bus.calculateFuelEfficiency());

        System.out.println("\n--- Electric Car ---");
        ((Vehicle)eCar).start();
        eCar.charge();
        System.out.println(((Vehicle)eCar).getInfo());
        System.out.println("Efficiency: " + ((Vehicle)eCar).calculateFuelEfficiency());
    }
}