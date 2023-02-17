import Model.*;
import Repo.DataRepo;

import java.awt.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ex2();
    }

    private static void ex1() { // Range of people
        // TODO...

        ArrayList<Person> people = DataRepo.getPeople().stream()
                .filter(p -> p.getAge() >= 20 && p.getAge() <= 40)
                .collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println(people);

    }

    private static void ex2() { // Average Displacement
        // TODO...
        ArrayList<Car> cars = new ArrayList<Car>();
        cars = DataRepo.getCarsWithEngines();

        float total = 0;
        for (Car c: cars) {
            total += c.getEngine().getDisplacment();
        }

        System.out.println(total/cars.size());
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
