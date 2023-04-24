import java.util.Scanner;

public class EvaluateTestPapers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the correct answers
        String correctAnswers = scanner.nextLine().toUpperCase();

        // Read the number of students
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // Evaluate the test papers of all the N students
        for (int i = 0; i < n; i++) {
            String answers = scanner.nextLine().toUpperCase();
            if (answers.length() != correctAnswers.length()) {
                System.out.println("Incorrect Input");
                return;
            }

            double marks = 0;
            for (int j = 0; j < answers.length(); j++) {
                char answer = answers.charAt(j);
                if (answer == 'X') {
                    continue; // question not attempted, no marks added or deducted
                }
                char correctAnswer = correctAnswers.charAt(j);
                if (answer == correctAnswer) {
                    marks += 1;
                } else {
                    marks -= 0.25;
                }
            }
            System.out.print(marks + " ");
        }
    }
}