import java.util.ArrayList;
import java.util.List;

public class LambdaTask2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        numbers.add(15);
        numbers.add(3);
        numbers.add(12);

        numbers.removeIf(n -> n % 2 == 0);
        numbers.replaceAll(n -> n * 2);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Final list: " + numbers);
        System.out.println("Sum: " + sum);
    }
}