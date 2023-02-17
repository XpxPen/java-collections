import Model.*;
import Repo.DataRepo;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ex5();
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
        ArrayList<Person> people = DataRepo.getPeople();
        people.forEach(p -> {
            p.setFirstName(p.getFirstName().toUpperCase());
            p.setLastName(p.getLastName().toUpperCase());
        });

        System.out.println(people);
    }

    private static void ex4() { // Word counter
        // TODO...
        HashMap<String, Integer> wordsCounter = new HashMap<String, Integer>();
        ArrayList<String> words = DataRepo.readFile();

        System.out.println(words);

        words.forEach(w -> {
            if (wordsCounter.containsKey(w)) {
                wordsCounter.put(w, wordsCounter.get(w)+1);
            } else {
                wordsCounter.put(w, 1);
            }
        });

        System.out.println(wordsCounter);

    }

    private static void ex5() { // Sorted word counter
        // TODO...
        HashMap<String, Integer> wordsCounter = new HashMap<String, Integer>();
        ArrayList<String> words = DataRepo.readFile();
        ArrayList<Word> wordsList = new ArrayList<Word>();

        System.out.println(words);

        words.forEach(w -> {
            if (wordsCounter.containsKey(w)) {
                wordsCounter.put(w, wordsCounter.get(w)+1);
            } else {
                wordsCounter.put(w, 1);
            }
        });

        System.out.println(wordsCounter);

        wordsCounter.forEach((k, v) -> {
            wordsList.add(new Word(k, v));
        });

        Collections.sort(wordsList);

        System.out.println(wordsList);
    }
}
