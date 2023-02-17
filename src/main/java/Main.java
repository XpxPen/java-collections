import Model.*;
import Repo.DataRepo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex1();
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
