public class Motorcycle extends AbstractVehicle {

    public Motorcycle() {
        super("Motorcycle", 25.0);
    }

    @Override
    public String getInfo() {
        return "Motorcycle\nEfficiency: " + efficiency + " km/l";
    }
}