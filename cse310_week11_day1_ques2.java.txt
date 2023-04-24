import java.util.Scanner;

public class Outer_Calculator {
    private static Scanner sc = new Scanner(System.in);

    public static class Inner_Calculator {
        public static int addition(int a, int b) {
            return a + b;
        }

        public static int subtraction(int a, int b) {
            return a - b;
        }

        public static int multiplication(int a, int b) {
            return a * b;
        }

        public static int division(int a, int b) {
            return a / b;
        }
    }

    public static void main(String[] args) {
        //Enter first number
        int num1 = sc.nextInt();

       // Enter second number
        int num2 = sc.nextInt();

       
        char operator = sc.next().charAt(0);

        int result = 0;

        switch (operator) {
            case '+':
                result = Inner_Calculator.addition(num1, num2);
                break;

            case '-':
                result = Inner_Calculator.subtraction(num1, num2);
                break;

            case '*':
                result = Inner_Calculator.multiplication(num1, num2);
                break;

            case '/':
                result = Inner_Calculator.division(num1, num2);
                break;

            default:
                System.out.println("Invalid operator");
                System.exit(0);
        }

        System.out.println(result);
    }
}