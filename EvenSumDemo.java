import java.util.Arrays;
import java.util.List;

public class EvenSumDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        int evenSum = numbers.stream()
                .filter(n -> n % 2 == 0)  // filter even numbers
                .mapToInt(Integer::intValue)  // convert to IntStream
                .sum();  // sum them up

        System.out.println("Sum of even numbers: " + evenSum);
    }
}
