import Model.*;
import Repo.DataRepo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() { // Range of people
       ArrayList<Person> people = DataRepo.getPeople();
       for (Person person: people) {
           if(person.getAge() >= 20 && person.getAge() <= 40) {
               System.out.print(person);
           }
       }
    }

    private static void ex2() { // Average Displacement
        // TODO...

    }

    private static void ex3() { // People Uppercase
        // TODO...

    }

    private static void ex4() { // Word counter
        // TODO...

    }

    private static void ex5() { // Sorted word counter
        // TODO...

    }
}
