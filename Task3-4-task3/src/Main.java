import java.io.*;

public class Main {
    public static void main(String[] args) {

        String filename = "enrollments.ser";

        Student s = new Student(1, "Ali", 22);
        Course c = new Course("CS101", "Java", "Dr.Smith");
        Enrollment e = new Enrollment(s, c, "2023-01-01");

        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(filename))) {

            out.writeObject(e);
            System.out.println("Saved!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(filename))) {

            Enrollment read = (Enrollment) in.readObject();
            System.out.println("Loaded: " + read);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}