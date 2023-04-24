import java.util.*;

public class Student {
    String name;

    public Student(String name) {
        if (name.matches("[a-zA-Z]+")) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String input = scanner.nextLine();
        scanner.close();
        
        Student student = new Student(name);
        System.out.println(student.name);
        
        if (!input.matches("[a-zA-Z]+")) {
            System.out.println("Unknown");
        }
    }
}