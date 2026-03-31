public class ElectricCar extends AbstractVehicle {

    public ElectricCar() {
        super("Electric Car", 0.15); // kWh/km
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Car\nEfficiency: " + efficiency + " kWh/km";
    }
}