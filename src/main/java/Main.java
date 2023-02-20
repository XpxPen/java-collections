import Model.*;
import Repo.DataRepo;
import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    private static void ex1() { // Range of people
       ArrayList<Person> people = DataRepo.getPeople();
       for (Person p: people) {
           if (p.getAge() >= 20 && p.getAge() <= 40) {
               System.out.print(p);
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
        var people = DataRepo.getPeople().stream()
                .map(person -> person.toString().toUpperCase())
                .collect(toList());
        people.forEach(System.out::print);
    }

    private static void ex4() { // Word counter
        var words = new HashMap<String, Long>();
        var file = DataRepo.readFile().stream()
                .map(w -> words.put(w , w.chars().count()))
                .collect(Collectors.toList());

        System.out.println(words);
    }

    private static void ex5() { // Sorted word counter

    }
}
