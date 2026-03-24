import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("start: ");
        int start = sc.nextInt();

        System.out.print("end: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            if (i < 2) continue;

            boolean prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(i);
            }
        }
    }
}