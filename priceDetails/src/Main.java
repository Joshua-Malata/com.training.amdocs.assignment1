import java.util.*;
public class Main {
    static void validate() throws InvalidPriceException
    {
            throw new InvalidPriceException("Must be a Integer");
    }
    public static void main(String[] args) {
        try     {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number of items:");
            if (sc.hasNextInt()){
                int a = sc.nextInt();
                System.out.println("Enter price");
                int b = sc.nextInt();
                System.out.println("Items : "+a);
                System.out.println("Price : "+b);
            }else {
                validate();
            }
        }
        catch(InvalidPriceException e) {
            System.out.println(e);
        }
    }
}
