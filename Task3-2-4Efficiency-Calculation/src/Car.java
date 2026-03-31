public class Car extends AbstractVehicle {

    public Car() {
        super("Car", 12.5);
    }

    @Override
    public String getInfo() {
        return "Car\nEfficiency: " + efficiency + " km/l";
    }
}