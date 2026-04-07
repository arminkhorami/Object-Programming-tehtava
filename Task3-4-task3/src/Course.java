import java.io.Serializable;

public class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String code, String name, String instructor) {
        this.courseCode = code;
        this.courseName = name;
        this.instructor = instructor;
    }

    public String toString() {
        return courseCode + " " + courseName + " " + instructor;
    }
}