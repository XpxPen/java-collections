import Model.*;
import Repo.DataRepo;
import java.util.*;
import java.util.stream.Stream;

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
       ArrayList<Car> cars = DataRepo.getCarsWithEngines();
        OptionalDouble engines = cars.stream()
                .mapToDouble(d -> d.getEngine().getDisplacment())
                .average();
        System.out.print(engines.getAsDouble());
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
