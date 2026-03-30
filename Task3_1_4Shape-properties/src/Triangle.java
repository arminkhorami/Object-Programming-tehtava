public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}