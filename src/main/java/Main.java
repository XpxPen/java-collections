import Model.*;
import Repo.DataRepo;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
    }

    private static void ex1() { // Range of people
       var people = new ArrayList<Person>();
       people = DataRepo.getPeople();
       var filterList = people.stream()
               .filter(p -> p.getAge() >= 20)
               .filter(p -> p.getAge() <= 40)
               .collect(Collectors.toList());
       System.out.println(filterList);
    }

    private static void ex2() { // Average Displacement\
        var cars = new ArrayList<Car>();
        cars = DataRepo.getCarsWithEngines();
        var filterList = cars.stream()
                .mapToDouble(c -> c.getEngine().getDisplacment())
                .summaryStatistics();
        //.average();
        System.out.println(Math.round(filterList.getAverage() * 100.0) / 100.0);
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
