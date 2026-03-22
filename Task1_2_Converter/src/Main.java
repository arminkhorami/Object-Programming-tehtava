import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fahrenheit: ");
        double f = Double.parseDouble(scanner.nextLine());

        double c = (f - 32) * 5 / 9;

        System.out.printf("Celsius: %.1f\n", c);
    }
}