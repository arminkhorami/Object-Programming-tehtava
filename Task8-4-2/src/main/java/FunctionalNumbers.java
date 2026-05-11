import java.util.Arrays;
import java.util.List;

public class FunctionalNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 3, 12);
        int sum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .mapToInt(Integer::intValue)
                .sum();                    // جمع
        System.out.println("Result sum: " + sum);
    }
}