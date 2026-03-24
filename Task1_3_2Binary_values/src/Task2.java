import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Binary: ");
        String bin = sc.nextLine();

        int result = 0;

        for (int i = 0; i < bin.length(); i++) {
            result = result * 2 + (bin.charAt(i) - '0');
        }

        System.out.println("Decimal: " + result);
    }
}