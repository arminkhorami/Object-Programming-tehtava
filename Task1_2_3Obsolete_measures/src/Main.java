import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight (g): ");
        double grams = Double.parseDouble(scanner.nextLine());

        int leiviska = (int) (grams / (20 * 32 * 13.28));
        grams = grams % (20 * 32 * 13.28);

        int naula = (int) (grams / (32 * 13.28));
        grams = grams % (32 * 13.28);

        double luoti = grams / 13.28;

        System.out.println(leiviska + " leiviskä, " +
                naula + " naula, " +
                String.format("%.2f", luoti) + " luoti");
    }
}