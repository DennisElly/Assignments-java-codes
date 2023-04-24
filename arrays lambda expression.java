import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class ArrayOperationsLambda {
    public static void main(String[] args) {
        int[] array = { 10, 5, 20, 15, 30 };

        // Calculate the maximum value of the array
        IntBinaryOperator max = (x, y) -> x > y ? x : y;
        int maxValue = Arrays.stream(array).reduce(Integer.MIN_VALUE, max);

        // Calculate the minimum value of the array
        IntBinaryOperator min = (x, y) -> x < y ? x : y;
        int minValue = Arrays.stream(array).reduce(Integer.MAX_VALUE, min);

        // Calculate the sum of the array
        int sum = Arrays.stream(array).sum();

        // Output the results
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);
        System.out.println("Sum: " + sum);
    }
}
