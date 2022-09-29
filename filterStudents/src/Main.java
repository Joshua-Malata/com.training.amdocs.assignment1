import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> studentCollection = new ArrayList<Student>();
        studentCollection.add(new Student("Ali", 23, 1001));
        studentCollection.add(new Student("Toma", 18, 1002));
        studentCollection.add(new Student("Carla", 30, 1003));
        studentCollection.add(new Student("Deuel", 12, 1004));
        studentCollection.add(new Student("Luna", 2, 1005));

        System.out.println("Not Sorted and Filtered");
        studentCollection.forEach((c)->System.out.println(c));
        System.out.println("-------------------------------------------");
        System.out.println("Sorted and Filterd By Name");
        studentCollection.stream()
                .filter(a->a.getName().toLowerCase().endsWith("a"))
                .sorted((a, b)->a.getName().compareTo(b.getName()))
                .forEach((d)->System.out.println(d));



    }
}
