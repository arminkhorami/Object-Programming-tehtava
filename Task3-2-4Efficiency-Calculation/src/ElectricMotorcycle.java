public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle() {
        super("Electric Motorcycle", 0.08);
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle\nEfficiency: " + efficiency + " kWh/km";
    }
}