import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaTask1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ali", 25, "New York"));
        people.add(new Person("Sara", 30, "London"));
        people.add(new Person("John", 20, "New York"));
        people.add(new Person("Emma", 35, "Paris"));

        people.sort((p1, p2) -> p1.age - p2.age);
        people.removeIf(p -> !p.city.equals("New York"));
        for (Person p : people) {
            System.out.println(p);
        }
    }
}