import java.util.*;
public class main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type hosteler or day: ");
        String str = sc.nextLine();

        if (str.equalsIgnoreCase("hosteler") ){
            student obj = new student();
            obj.hosteler();
        }else if (str.equalsIgnoreCase("day") ){
            student obj1 = new student();
            obj1.day();
        }


    }
}
