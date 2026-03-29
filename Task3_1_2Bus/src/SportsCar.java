public class SportsCar extends Car {

    @Override
    public void accelerate() {
        speed += 25;
        fuel -= 10;
    }

    @Override
    public void brake() {
        speed -= 25;
        if (speed < 0) speed = 0;
    }
}