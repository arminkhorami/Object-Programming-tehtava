import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        String fileName = "fibonacci.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            long a = 0, b = 1;

            writer.write(a + "," + b);

            for (int i = 2; i < 60; i++) {
                long c = a + b;
                writer.write("," + c);
                a = b;
                b = c;
            }

            System.out.println("Fibonacci saved to file!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}