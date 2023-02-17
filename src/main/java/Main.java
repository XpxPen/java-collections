import Model.*;
import Repo.DataRepo;
import java.util.*;


public class Main {
    public static void main(String[] args) {
       System.out.println("Hi henok");
        ex1();
    }

    private static void ex1() { // Range of people

        var listOfPeople = DataRepo.getPeople();
        // ArrayList<Person> listOfPeople = DataRepo.getPeople();
          ArrayList<Person> selectedPeople = new ArrayList<Person>();
          for(Person person : listOfPeople){
              if(person.getAge() >=20 && person.getAge() <=40){
                  selectedPeople.add(person);
              }

          }

        System.out.println(selectedPeople);
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
