import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Side 1: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Side 2: ");
        double b = Double.parseDouble(scanner.nextLine());

        double c = Math.sqrt(a * a + b * b);

        System.out.println("Hypotenuse: " + c);
    }
}