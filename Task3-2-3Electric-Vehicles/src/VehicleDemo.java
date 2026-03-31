public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bus = new Bus();
        ElectricVehicle eCar = new ElectricCar();
        ElectricVehicle eMoto = new ElectricMotorcycle();

        System.out.println("\n--- Car ---");
        car.start();
        car.stop();
        System.out.println(car.getInfo());

        System.out.println("\n--- Bus ---");
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());

        System.out.println("\n--- Electric Car ---");
        ((Vehicle)eCar).start();
        eCar.charge();
        ((Vehicle)eCar).stop();
        System.out.println(((Vehicle)eCar).getInfo());

        System.out.println("\n--- Electric Motorcycle ---");
        ((Vehicle)eMoto).start();
        eMoto.charge();
        ((Vehicle)eMoto).stop();
        System.out.println(((Vehicle)eMoto).getInfo());
    }
}