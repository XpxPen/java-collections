import Model.*;
import Repo.DataRepo;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Main {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        ex5();
    }

    private static void ex1() { // Range of people

        var people = DataRepo.getPeople().stream()
                .filter(p -> p.getAge() >= 20 && p.getAge() <=40)
                .collect(Collectors.toList());

        people.forEach(System.out::println);

    }

    private static void ex2() { // Average Displacement

        var cars = ((float) DataRepo.getCarsWithEngines().stream()
                .mapToDouble(c -> c.getEngine().getDisplacment())
                .average()
                .getAsDouble());

        System.out.println(cars);

    }

    private static void ex3() { // People Uppercase
        var people = DataRepo.getPeople().stream()
                .map(p -> p.toString().toUpperCase())
                .collect(Collectors.toList());

        people.forEach(System.out::println);
    }

    private static void ex4() { // Word counter
        var pairs = new HashMap<String, Long>();
        DataRepo.readFile().stream()
                .map(f -> pairs.put(f , f.chars().count()))
                .collect(Collectors.toList());

        System.out.println(pairs);

    }

    private static void ex5() { // Sorted word counter

        var pairs = new HashMap<String, Integer>();
        DataRepo.readFile().stream()
                .map(p -> pairs.put(p , (int) p.chars().count()))
                .collect(Collectors.toList());

        Map<String, Integer> sorted = pairs.entrySet().stream()
                .sorted(comparingByValue())
                .collect( toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(sorted);
    }
}
