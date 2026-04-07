import java.io.Serializable;

public class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student s, Course c, String date) {
        this.student = s;
        this.course = c;
        this.enrollmentDate = date;
    }

    public String toString() {
        return student + " | " + course + " | " + enrollmentDate;
    }
}