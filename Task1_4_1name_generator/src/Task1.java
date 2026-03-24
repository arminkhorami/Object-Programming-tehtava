import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String[] firstNames = {"Ali", "Sara", "Reza", "Nina"};
        String[] lastNames = {"Ahmadi", "Karimi", "Hosseini", "Mohammadi"};

        Scanner sc = new Scanner(System.in);

        System.out.print("How many names? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int f = (int)(Math.random() * firstNames.length);
            int l = (int)(Math.random() * lastNames.length);

            System.out.println(firstNames[f] + " " + lastNames[l]);
        }
    }
}