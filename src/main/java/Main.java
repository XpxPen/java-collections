import Model.*;
import Repo.DataRepo;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }

    private static void ex1() { // Range of people
        var people = DataRepo.getPeople();
        var ageList = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() >= 20 && p.getAge() <= 40)
                ageList.add(p);
        }
        ;
        System.out.println("Ex1: " + ageList);
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
        System.out.println("Ex2: " + average / displacementAverage.size());
    }

    private static void ex3() { // People Uppercase
        var peopleUpper = DataRepo.getPeople();
        peopleUpper.stream().forEach(
                person -> person.setFirstName(person.getFirstName().toUpperCase()));
        peopleUpper.stream().forEach(
                person -> person.setLastName(person.getLastName().toUpperCase()));
        System.out.println("Ex3: " + peopleUpper);
    }

    private static void ex4() { // Word counter
        var words = DataRepo.readFile();
        HashMap<String, Integer> wordCounter = new HashMap<>();

        for (String word : words) {
            var count = wordCounter.get(word);
            if (count == null)
                wordCounter.put(word, 1);
            else {
                wordCounter.put(word, count + 1);
            }
        }
        System.out.println("Ex4: " + wordCounter);
    }

    private static void ex5() { // Sorted word counter
        var words = DataRepo.readFile();
        HashMap<String, Integer> wordCounter = new HashMap<>();
        HashMap<String, Integer> sortedWordCounter;
        for (String word : words) {
            var count = wordCounter.get(word);
            if (count == null)
                wordCounter.put(word, 1);
            else {
                wordCounter.put(word, count + 1);
            }
        }
        sortedWordCounter = wordCounter.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors
                        .toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new)
                );
        System.out.println("Ex5: " + sortedWordCounter);
    }
}
