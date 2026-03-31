public class Car extends AbstractVehicle {

    public Car() {
        super("Car", "Petrol");
    }

    @Override
    public String getInfo() {
        return "Type: Car\nFuel: Petrol\nColor: Red";
    }
}