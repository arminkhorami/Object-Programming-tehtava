public class Motorcycle extends AbstractVehicle {

    public Motorcycle() {
        super("Motorcycle", "Gasoline");
    }

    @Override
    public String getInfo() {
        return "Type: Motorcycle\nFuel: Gasoline\nColor: Black";
    }
}