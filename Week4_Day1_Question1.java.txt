import java.io.*;
import java.util.*;

public class p {
    enum Subject {
        Java,
        OS,
        AI,
        Android,
        Default;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Subject s;
        if (str.equals("Java") || str.equals("OS") || str.equals("AI") || str.equals("Android")) {
            s = Subject.valueOf(str);
        } else {
            str = "Default";
            s = Subject.valueOf(str);
        }

        switch (s) {
            case Java: {
                System.out.println("Shruti " + 4);
                break;
            }
            case OS: {
                System.out.println("Puneet Kumar " + 3);
                break;
            }
            case AI: {
                System.out.println("James William " + 2);
                break;
            }
            case Android: {
                System.out.println("Md. Adil Khan " + 3);
                break;
            }
            case Default: {
                System.out.println("This subject is not running in this semester.");
            }
        }

    }
}