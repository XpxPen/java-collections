import Model.*;
import Repo.DataRepo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex4();
    }

    private static void ex1() { // Range of people
        // TODO...
        var peopleList = DataRepo.getPeople();
        var shortList = new ArrayList<Person>();
        for (Person p : peopleList) {
            if (p.getAge() >= 20 && p.getAge() <= 40) {
                shortList.add(p);
            }
        }
        System.out.println(shortList);

    }

    private static void ex2() { // Average Displacement
        // TODO...
        var carList = DataRepo.getCarsWithEngines();
        var engineList = new ArrayList<Engine>();

        for (Car c : carList) {
            engineList.add(c.getEngine());
        }

        var totalDisplacement = 0.0F;
        for (Engine e : engineList) {
            totalDisplacement += e.getDisplacment();
        }
        var averageDisplacement = totalDisplacement / engineList.size();
        System.out.println(averageDisplacement);


    }

    private static void ex3() { // People Uppercase
        // TODO...
        var peopleList = DataRepo.getPeople();

        peopleList.forEach(p -> {
            p.setFirstName(p.getFirstName().toUpperCase());
            p.setLastName(p.getLastName().toUpperCase());
        });
        System.out.println(peopleList);
    }

    private static void ex4() { // Word counter
        // TODO...
        var wordHashMap = new HashMap<String, Integer>();

        var wordList = DataRepo.readFile();
        for (String word : wordList) {
            if (wordHashMap.containsKey(word)) {
                // Increment the count for this word.
                var count = wordHashMap.get(word);
                wordHashMap.put(word, ++count);
            } else {
                // Add the word to the HashMap for the first time.
                wordHashMap.put(word, 1);
            }
        }

        var keySet = wordHashMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + wordHashMap.get(key));
        }
    }

    private static void ex5() { // Sorted word counter
        // TODO...

    }
}
