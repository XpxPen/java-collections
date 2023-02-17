import Model.*;
import Repo.DataRepo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() { // Range of people
        var thePeople = DataRepo.getPeople();
        var people20to40 = new ArrayList<Person>();

        for (Person person : thePeople){
            if (person.getAge() >= 20 && person.getAge() <=40){
                people20to40.add(person);
            }
        }
        for (Person person : people20to40) {
            System.out.println(person);
        }
        // TODO...

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
