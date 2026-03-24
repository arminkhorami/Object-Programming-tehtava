import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int score = 0;

            for (int i = 0; i < 10; i++) {

                int a = (int)(Math.random() * 10) + 1;
                int b = (int)(Math.random() * 10) + 1;

                System.out.print(a + " * " + b + " = ");
                int ans = sc.nextInt();

                if (ans == a * b) {
                    System.out.println("Correct");
                    score++;
                } else {
                    System.out.println("Wrong");
                }
            }

            System.out.println("Score: " + score);

            if (score == 10) {
                System.out.println("Perfect! You mastered it!");
                break;
            } else {
                System.out.println("Try again...");
            }
        }
    }
}