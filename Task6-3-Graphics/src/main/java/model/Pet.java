package model;

public class Pet {
    private double x, y;
    private final double speed = 4;

    public Pet(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void moveTo(double targetX, double targetY) {

        double dx = targetX - x;
        double dy = targetY - y;
        double distance = Math.sqrt(dx * dx + dy * dy);

        if (distance > speed) {
            x += (dx / distance) * speed;
            y += (dy / distance) * speed;
        }
    }

    public double getX() { return x; }
    public double getY() { return y; }
}