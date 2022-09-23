import java.util.*;

public class Main{
    static void validate() throws invalidEx{
        throw new invalidEx("INVALID!, MUST BE AN INTEGER!");
    }
    public static void main(String args[]){
        try {
            Scanner sc=new Scanner(System.in);
            int i=0;
            Phonebook objMain=new Phonebook();
            while(i==0){
                System.out.println("Menu:\n1.Add contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Exit");
                System.out.println("Enter your choice: ");
                if(sc.hasNextInt()){
                    int n=Integer.parseInt(sc.nextLine());
                    if(n==1){
                        Contact obj=new Contact();
                        System.out.println("Add a contact:");
                        System.out.println("Enter the First Name: ");
                        obj.setFirstName(sc.nextLine());
                        System.out.println("Enter the Last Name: ");
                        obj.setLastName(sc.nextLine());
                        System.out.println("Enter the Phone No.: ");
                        obj.setPhoneNumber(Long.parseLong(sc.nextLine()));
                        System.out.println("Enter the Email: ");
                        obj.setEmailId(sc.nextLine());
                        objMain.addContact(obj);
                    }else if(n==2){
                        System.out.println("The contacts in the List are:");
                        List<Contact> obj1=objMain.viewAllContacts();
                        for(Contact a:obj1){
                            System.out.println("First Name:"+a.getFirstName());
                            System.out.println("Last Name:"+a.getLastName());
                            System.out.println("Phone No.:"+a.getPhoneNumber());
                            System.out.println("Email:"+a.getEmailId());
                        }
                    }else if(n==3){
                        System.out.println("Enter the Phone number to search contact:");
                        Long obj2=Long.parseLong(sc.nextLine());
                        Contact b=objMain.viewContactGivenPhone(obj2);
                        System.out.println("The contact is:");
                        System.out.println("First Name:"+b.getFirstName());
                        System.out.println("Last Name:"+b.getLastName());
                        System.out.println("Phone No.:"+b.getPhoneNumber());
                        System.out.println("Email: "+b.getEmailId());
                    }else if(n==4){
                        System.out.println("Enter the Phone number to remove :");
                        Long obj3=Long.parseLong(sc.nextLine());
                        System.out.println("Do you want to remove the contact (Y/N):");
                        char ch=sc.nextLine().charAt(0);
                        if(ch=='Y'){
                            boolean f1=objMain.removeContact(obj3);
                            if(f1) {
                                System.out.println("Deleted successfully");
                            }else{
                                System.out.println("Contact not found");
                            }
                        }
                        if(ch=='N') {
                            System.out.println("Canceled.");
                        }
                    }
                    if(n==5) {
                        System.exit(0);
                    }
                }else {
                    validate();
                }
            }
        }catch(invalidEx e){
            System.out.println(e);
        }
    }
}