import Model.*;
import Repo.DataRepo;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
        ex5();
    }
    public static ArrayList<Person> personList = DataRepo.getPeople();
    public static ArrayList<Car> carList = DataRepo.getCarsWithEngines();

    public static ArrayList<String> readFileList = DataRepo.readFile();



    private static void ex1() { // Range of people
        // TODO...

        for (Person p : personList) {
            if (p.getAge() > 20 || p.getAge() < 40) {
                System.out.println(personList);
            }
        }

    }

    private static void ex2() { // Average Displacement
        // TODO...

        float sum = 0;

        int i = 0;
        while(i < carList.size()) {
            sum += carList.get(i).getEngine().getDisplacment();
            i++;
        }

        float avg = (sum / carList.size());
        System.out.println("Average displacement size of all the engines are: " + avg);

    }

    private static void ex3() { // People Uppercase
        // TODO...
        personList.stream().map(FirstName -> FirstName.toString().toUpperCase())
                .forEach(FirstName -> System.out.println(FirstName + ""));
        personList.stream().map(LastName -> LastName.toString().toUpperCase())
                .forEach(LastName -> System.out.println(LastName + ""));
    }

    private static void ex4() { // Word counter
        // TODO...
        HashMap wordMap = new HashMap<String, Integer>();
        for (String word: readFileList) {
            if (wordMap.containsKey(word)) {
                int count = (int) wordMap.get(word);
                wordMap.put(word, ++count);
            } else {
                wordMap.put(word, 1);
            }
        }

        Set set = wordMap.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }


    private static void ex5() { // Sorted word counter
        // TODO...
        Map<String, Integer> wordMap = new TreeMap<>();

        for (String word: readFileList) {
            if (wordMap.containsKey(word)) {
                int count = (int) wordMap.get(word);
                wordMap.put(word, ++count);
            } else {
                wordMap.put(word, 1);
            }
        }

        Set set = wordMap.entrySet();
        Iterator i = set.iterator();
        wordMap = wordMap.entrySet().stream().sorted(Comparator.comparing(
                Map.Entry<String, Integer>::getValue)).collect(
                LinkedHashMap<String, Integer>::new,
                (wordMap1, e) -> wordMap1.put(e.getKey(), e.getValue()),
                LinkedHashMap::putAll);

        wordMap.entrySet().forEach(System.out::println);
    }
}
