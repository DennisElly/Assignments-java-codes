import java.util.Scanner;

interface PersonFinder {
    void find(Person[] people);
}

class Person {
    int age;

    Person(int age) {
        if (age < 0) {
            this.age = 18; 
        } else {
            this.age = age;
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);

        
        int numPeople = kl.nextInt();

       
        if (numPeople < 1) {
            System.out.println("Invalid input");
            return;
        }

        
        Person[] people = new Person[numPeople];
        for (int i = 0; i < numPeople; i++) {
            int age = kl.nextInt();
            people[i] = new Person(age);
        }

      
        PersonFinder finder = (Person[] peopleArray) -> {
            int count = 0;
            for (Person person : peopleArray) {
                if (person.age > 25) {
                    count++;
                }
            }
            System.out.println(count);
        };

        finder.find(people); 
    }
}