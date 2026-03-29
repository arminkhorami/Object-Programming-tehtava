public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[] {
                new Circle(5, "Red"),
                new Rectangle(4, 6, "Blue"),
                new Triangle(3, 8, "Green")
        };

        for (Shape s : shapes) {
            System.out.println(s.toString());
            System.out.println("Area: " + s.calculateArea());
            System.out.println("Color: " + s.getColor());
            System.out.println();
        }
    }
}