import java.util.*;
public class Main {
    static void validate() throws InvalidException
    {
        throw new InvalidException("INVALID");
    }

    public static void main(String[] args){
        try{
            Func func = new Func();
            Scanner sc = new Scanner(System.in);
            int i = 0;
            while(i==0){
                System.out.println("1.Enroll\n2.Add Course\n3.View Students\n4.View Course\n5.Search Course\n6. Exit");
                System.out.println("Enter number of choice!");
                int n = Integer.parseInt(sc.nextLine());
                if(n==1){
                    Details obj = new Details();
                    System.out.println("Enter Student ID:");
                    obj.setStudentId(Integer.parseInt(sc.nextLine()));
                    System.out.println("Enter Student Name:");
                    obj.setStudName(sc.nextLine());
                    System.out.println("Enter Student Address:");
                    obj.setStudAdd(sc.nextLine());
                    System.out.println("Enter Course:");
                    obj.setCourse(sc.nextLine());
                    func.addStudent(obj);
                }else if(n==2){
                    Details obj1 = new Details();
                    System.out.println("Enter Course:");
                    obj1.setCourse(sc.nextLine());
                    System.out.println("Enter Schedule:");
                    obj1.setSched(sc.nextLine());
                    func.addCourse(obj1);
                }else if(n==3){
                    List<Details> obj2 = func.viewStudents();
                    for(Details a: obj2){
                        System.out.println("ID: "+ a.getStudentId());
                        System.out.println("Name: "+ a.getStudName());
                        System.out.println("Address: "+ a.getStudAdd());
                    }
                }else if(n==4){
                    List<Details> obj3 = func.viewCourse();
                    for(Details b: obj3){
                        System.out.println("Course: "+ b.getCourse());
                        System.out.println("Schedule: "+ b.getSched());
                    }
                }else if(n==5){
                    System.out.println("Enter Course:");
                    List<Details> obj4 =func.searchCourse(sc.nextLine());
                    for(Details c : obj4){
                        System.out.println("Course: "+ c.getCourse());
                        System.out.println("Schedule: "+ c.getSched());
                    }
                }else if(n==6){
                    System.exit(0);
                }else {
                    validate();
                }
            }

        } catch(InvalidException e){
            System.out.println(e);
        }
    }
}
