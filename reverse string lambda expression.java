 import java.util.function.Function;

public class ReverseStringLambda {
    public static void main(String[] args) {
        // Define lambda expression to reverse a string
        Function<String, String> reverseString = s -> new StringBuilder(s).reverse().toString();

        // Get input from user
        System.out.print("Enter a string to reverse: ");
        String stringToReverse = System.console().readLine();

        // Call the lambda function to reverse the string
        String reversedString = reverseString.apply(stringToReverse);

        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);
    }
}





