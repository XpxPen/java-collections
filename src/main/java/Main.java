import Model.*;
import Repo.DataRepo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex2();
    }

    private static void ex1() { // Range of people
       ArrayList<Person> people = DataRepo.getPeople();
       for (Person person: people) {
           if (person.getAge() >= 20 && person.getAge() <= 40) {
               System.out.print(person);
           }
       }
    }

    private static void ex2() { // Average Displacement
        var cars = DataRepo.getCarsWithEngines().stream()
                .mapToDouble(car -> car.getEngine().getDisplacment())
                .average().getAsDouble();
        System.out.println(cars);
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
