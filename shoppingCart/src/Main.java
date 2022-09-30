import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=0;
        shoppingCart objMain=new shoppingCart();
        while(i==0){
            System.out.println("---------Menu---------" +
                    "\n1. Add Grocery Item" +
                    "\n2. View Grocery" +
                    "\n3. Add Electronic Item." +
                    "\n4. View Electronics Item." +
                    "\n5. Remove Grocery Item" +
                    "\n6. Remove Electronic Item." +
                    "\n7. Exit");
            System.out.println("Enter your choice: ");
                int n=Integer.parseInt(sc.nextLine());
                if(n==1){
                    Groceries obj=new Groceries();
                    System.out.println("Add a Grocery:");
                    System.out.println("Enter Item Name: ");
                    obj.setItem(sc.nextLine());
                    System.out.println("Enter Product Id: ");
                    obj.setProductId(Integer.parseInt(sc.nextLine()));
                    System.out.println("Enter Number of Items: ");
                    obj.setAllItems(Integer.parseInt(sc.nextLine()));
                    objMain.addGrocery(obj);
                }else if(n==2){
                    HashMap<Groceries,Groceries> obj1 = objMain.viewAllGrocery();
                    for(Groceries a: obj1.keySet()){
                        System.out.println("Item: "+ a.getItem());
                        System.out.println("Product ID: "+a.getProductId());
                        System.out.println("Number of Item: "+ a.getAllItems());
                    }
                }else if(n==3){
                    electronics obj=new electronics();
                    System.out.println("Add Electronic:");
                    System.out.println("Enter Item Name: ");
                    obj.setItem(sc.nextLine());
                    System.out.println("Enter Product Id: ");
                    obj.setProductId(Integer.parseInt(sc.nextLine()));
                    System.out.println("Enter Number of Items: ");
                    obj.setAllItems(Integer.parseInt(sc.nextLine()));
                    objMain.addElectornic(obj);

                }else if(n==4){
                    HashMap<electronics,electronics> obj2 = objMain.viewAllElectornic();
                    for(electronics b: obj2.keySet()){
                        System.out.println("Item: "+ b.getItem());
                        System.out.println("Product ID: "+b.getProductId());
                        System.out.println("Number of Item: "+ b.getAllItems());
                    }
                }else if(n==5){
                    System.out.println("Enter the Grocery Product ID to remove :");
                    Long obj3= Long.parseLong(sc.nextLine());
                    System.out.println("Do you want to remove the contact (Y/N):");
                    char ch=sc.nextLine().charAt(0);
                    if(ch=='Y'|| ch == 'y'){
                        boolean f1=objMain.removeGrocery(obj3);
                        if(f1) {
                            System.out.println("Deleted successfully");
                        }else{
                            System.out.println("Item not found");
                        }
                    }
                    if(ch=='N'|| ch == 'n') {
                        System.out.println("Canceled.");
                    }
                }else if(n==6){
                    System.out.println("Enter the Electronic item to remove :");
                    Long obj4= Long.parseLong(sc.nextLine());
                    System.out.println("Do you want to remove the contact (Y/N):");
                    char ch=sc.nextLine().charAt(0);
                    if(ch =='Y'|| ch == 'y'){
                        boolean f2=objMain.removeElectronic(obj4);
                        if(f2) {
                            System.out.println("Deleted successfully");
                        }else{
                            System.out.println("Item not found");
                        }
                    }
                    if(ch=='N'|| ch == 'n') {
                        System.out.println("Canceled.");
                    }
                }else if(n==7){
                    System.exit(0);
                }

        }
    }
}
