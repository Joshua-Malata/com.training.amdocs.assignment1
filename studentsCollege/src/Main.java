import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter College");
        System.out.println("Enter 1 for MMSU");
        System.out.println("Enter 2 for DWCL");
        System.out.println("Enter 3 for NCC");
        int a = sc.nextInt();

        ArrayList<Students> b = new ArrayList<>();
        if(a == 1){
            b.add(new Students("Mark",123,"MMSU"));
            Iterator it = b.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        } else if (a == 2){
            b.add(new Students("Edu",324,"DWCL"));
            Iterator it = b.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        } else if (a == 3){
            b.add(new Students("Ryan",441,"NCC"));
            Iterator it = b.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }

}
