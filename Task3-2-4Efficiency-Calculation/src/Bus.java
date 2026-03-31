public class Bus extends AbstractVehicle {

    public Bus() {
        super("Bus", 6.0);
    }

    @Override
    public String getInfo() {
        return "Bus\nEfficiency: " + efficiency + " km/l";
    }
}