public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;

    private boolean cruiseOn;
    private double targetSpeed;

    private final double MIN_SPEED = 30;
    private final double MAX_SPEED = 150;

    public Car(String typeName) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;
        cruiseOn = false;
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

    public void fillTank() {
        gasolineLevel = 100;
    }

    // ✅ Cruise Control
    public boolean turnOnCruise(double speed) {
        if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
            cruiseOn = true;
            targetSpeed = speed;
            this.speed = speed; // ساده
            return true;
        } else {
            cruiseOn = false;
            return false;
        }
    }

    public void turnOffCruise() {
        cruiseOn = false;
    }

    public double getTargetSpeed() {
        return targetSpeed;
    }
}