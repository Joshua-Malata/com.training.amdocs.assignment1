import java.util.*;

public class Main {
    public static void main(String[] args){

        Library queue = new Library(5);
        System.out.println("Adding Songs");
        queue.enqueue(1,"Rolling in the Deep","Adele");
        queue.enqueue(2,"Faithfully","Journey");

        System.out.println("Now Playing.....");
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println("Size of Que: " + queue.size());


    }




}
