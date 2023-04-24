import java.util.Scanner;

public class EmployeeAppraisal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeId = sc.nextInt();
        String employeeName = sc.next();
        String employeeDesignation = sc.next();
        int basicSalary = 20000;
        
        if (employeeId > 201) {
            basicSalary += 1000;
            System.out.println("Name: " + employeeName);
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Increased Salary: " + basicSalary + " INR");
        } else {
            System.out.println("No Appraisal");
        }
        sc.close();
    }
}