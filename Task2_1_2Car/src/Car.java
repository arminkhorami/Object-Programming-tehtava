public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;

    public Car(String typeName) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;
    }

    public void fillTank() {
        gasolineLevel = 100;
    }

    public void accelerate() {
        speed += 10;
    }

    public void decelerate(int amount) {
        speed = Math.max(0, speed - amount);
    }

    public double getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }
}