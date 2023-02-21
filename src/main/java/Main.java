import Model.*;
import Repo.DataRepo;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ex1(); ex2(); ex3();
    }

    private static void ex1() { // Range of people
        var people = DataRepo.getPeople();
        var ageList = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() >= 20 && p.getAge() <= 40)
                ageList.add(p);
        };
        System.out.println(ageList);
    }

    private static void ex2() { // Average Displacement
        float average = 0;
        var cars = DataRepo.getCarsWithEngines();
        var displacementAverage = cars.stream()
                .map(Car::getEngine)
                .collect(Collectors.toList());
        for (Engine e : displacementAverage) {
            average += e.getDisplacment();
        }
        System.out.println(average / displacementAverage.size());
    }

    private static void ex3() { // People Uppercase
        var peopleUpper = DataRepo.getPeople();
        peopleUpper.stream().forEach(
            person -> person.setFirstName(person.getFirstName().toUpperCase()));
        peopleUpper.stream().forEach(
            person -> person.setLastName(person.getLastName().toUpperCase()));
        System.out.println(peopleUpper);
    }

    private static void ex4() { // Word counter
        // TODO...

    }

    private static void ex5() { // Sorted word counter
        // TODO...

    }
}
