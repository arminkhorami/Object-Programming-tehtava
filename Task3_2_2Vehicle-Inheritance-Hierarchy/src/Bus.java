public class Bus extends AbstractVehicle {

    public Bus() {
        super("Bus", "Diesel");
    }

    @Override
    public String getInfo() {
        return "Type: Bus\nFuel: Diesel\nCapacity: 40 passengers";
    }
}