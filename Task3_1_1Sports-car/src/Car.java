public class Car {
    protected int speed = 0;
    protected int fuel = 100;

    public void accelerate() {
        speed += 10;
        fuel -= 5;
    }

    public void brake() {
        speed -= 10;
        if (speed < 0) speed = 0;
    }

    public void show() {
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuel);
    }
}