import Model.*;
import Repo.DataRepo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex1();
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
