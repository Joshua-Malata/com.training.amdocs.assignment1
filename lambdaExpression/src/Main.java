import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentCollection = new ArrayList<Student>();
        studentCollection.add(new Student("Ali", 23, 1001));
        studentCollection.add(new Student("Toma", 18, 1002));
        studentCollection.add(new Student("Jed", 30, 1003));
        studentCollection.add(new Student("Deuel", 12, 1004));
        studentCollection.add(new Student("Luna", 2, 1005));

        System.out.println("Sorted by Name");
        studentCollection.sort((a, b)->a.getName().compareTo(b.getName()));
        studentCollection.forEach((c)->System.out.println(c));
        System.out.println(" ");
        System.out.println("Sorted by ID");
        studentCollection.sort((a, b)->a.getId()-b.getId());
        studentCollection.forEach((c)->System.out.println(c));
        System.out.println(" ");
        System.out.println("Sorted by Age");
        studentCollection.sort((a, b)->a.getAge()-b.getAge());
        studentCollection.forEach((c)->System.out.println(c));

    }
}
