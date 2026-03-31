public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {

    protected String type;
    protected double efficiency;

    public AbstractVehicle(String type, double efficiency) {
        this.type = type;
        this.efficiency = efficiency;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public double calculateFuelEfficiency() {
        return efficiency;
    }

    @Override
    public void charge() {
        System.out.println(type + ": Not possible to charge");
    }
}