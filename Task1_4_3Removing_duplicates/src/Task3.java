import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            boolean exists = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == result[j]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                result[count] = arr[i];
                count++;
            }
        }

        System.out.println("Array without duplicates:");

        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }
    }
}