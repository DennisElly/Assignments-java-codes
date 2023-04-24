import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class ArrayOperationsLambda {
    public static void main(String[] args) {
        int[] array = { 10, 5, 20, 15, 30 };

        IntBinaryOperator max = (x, y) -> x > y ? x : y;
        int maxValue = Arrays.stream(array).reduce(Integer.MIN_VALUE, max);

        IntBinaryOperator min = (x, y) -> x < y ? x : y;
        int minValue = Arrays.stream(array).reduce(Integer.MAX_VALUE, min);

        int sum = Arrays.stream(array).sum();

        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);
        System.out.println("Sum: " + sum);
    }
}
