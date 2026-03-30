public class ShapeCalculator {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5, "Red"),
                new Rectangle(4, 6, "Blue"),
                new Triangle(3, 8, "Green")
        };

        double totalArea = 0;

        for (Shape s : shapes) {
            System.out.println("Shape: " + s.toString());
            System.out.println("Color: " + s.getColor());
            System.out.println("Area: " + s.calculateArea());
            System.out.println("------------------");

            totalArea += s.calculateArea();
        }

        System.out.println("Total Area of All Shapes: " + totalArea);
    }
}