package task2;
import java.time.LocalDate;
public class Human {
    final int age;
    final String firstName;
    final String lastName;
    final LocalDate birthDate;
    final int weight;

    Human(int age, String firstName, String lastName, LocalDate birthDate, int weight){ // Конструктор
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + birthDate.toString() + ") " + age + " years " + weight + " kg";
    }

}
