import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second + third;
        int product = first * second * third;

        double average = (first + second + third) / 3.0;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
    }
}