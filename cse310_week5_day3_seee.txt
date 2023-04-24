import java.util.Scanner;

class Student {
    private String name;
    private int registrationNo;

    public Student() {
        name = null;
        registrationNo = 0;
    }

    public void show() {
        System.out.println(name + "," + registrationNo);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegistrationNo(int registrationNo) {
        this.registrationNo = registrationNo;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            Student s = new Student();
            String name = sc.next();
            int regNo = sc.nextInt();
            while (regNo < 1) {
                System.out.println("Invalid registration number, please enter a positive value");
                regNo = sc.nextInt();
            }
            s.setName(name);
            s.setRegistrationNo(regNo);
            s.show();
        } else if (choice == 2) {
            Student s = new Student();
            s.show();
        } else {
            System.out.println("Wrong Choice");
        }
        sc.close();
    }
}