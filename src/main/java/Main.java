import Model.*;
import Repo.DataRepo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }

    private static void ex1() { // Range of people

        var peopleList = DataRepo.getPeople();
        var shortList = new ArrayList<Person>();
        for (Person p : peopleList){
            if (p.getAge() >= 20 && p.getAge() <= 40){
                shortList.add(p);
            }
        }
        //System.out.println(shortList);
    }

    private static void ex2() { // Average Displacement

        var carEngineList = DataRepo.getCarsWithEngines();
        float sum = 0f;
        float tot = 0f;
        for (var car : carEngineList){
            sum += car.getEngine().getDisplacment();
            tot++;
        }
        float avg = sum/tot;
        System.out.println("The average displacement is now: " + avg);
    }

    private static void ex3() { // People Uppercase
        System.out.println("Testing");
    }

    private static void ex4() { // Word counter


    }

    private static void ex5() { // Sorted word counter


    }
}
