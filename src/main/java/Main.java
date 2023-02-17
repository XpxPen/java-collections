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
       var people = new ArrayList<Person>();
       people = DataRepo.getPeople();
       var filterList = people.stream()
               .filter(p -> p.getAge() >= 20)
               .filter(p -> p.getAge() <= 40)
               .collect(Collectors.toList());
       System.out.println(filterList);
    }

    private static void ex2() { // Average Displacement\
        System.out.println();
        var cars = new ArrayList<Car>();
        cars = DataRepo.getCarsWithEngines();
        var filterList = cars.stream()
                .mapToDouble(c -> c.getEngine().getDisplacment())
                .summaryStatistics()
                .getAverage();
        System.out.println(Math.round(filterList * 100.0) / 100.0);
    }

    private static void ex3() { // People Uppercase
        System.out.println();
        var people = new ArrayList<Person>();
        people = DataRepo.getPeople();
        people.stream()
                .forEach(person -> person.setFirstName(person.getFirstName().toUpperCase()));
        people.stream()
                .forEach(person -> person.setLastName(person.getLastName().toUpperCase()));
        System.out.println(people);
    }

    private static void ex4() { // Word counter
        System.out.println();
        var words = new ArrayList<String>();
        words = DataRepo.readFile();
        var wordMap = new HashMap<String, Integer>();
        words.forEach(word -> wordMap.put(word, wordMap.getOrDefault(word, 0) + 1));
        wordMap.entrySet().forEach(word -> System.out.println(word.getKey() + " " + word.getValue()));
    }

    private static void ex5() { // Sorted word counter
        System.out.println();
        var words = new ArrayList<String>();
        words = DataRepo.readFile();
        var wordMap = new HashMap<String, Integer>();
        words.forEach(word -> wordMap.put(word, wordMap.getOrDefault(word, 0) + 1));
        List<Map.Entry<String, Integer>> wordList = new LinkedList<>(wordMap.entrySet());
        Collections.sort(wordList, Map.Entry.comparingByValue());
        wordList.forEach(word -> System.out.println(word.getKey() + ": " + word.getValue()));
    }
}
