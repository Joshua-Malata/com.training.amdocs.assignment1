public class Student {
    String name;
    int age;
    int id;

    Student(String n, int a, int i){
        name = n;
        age = a;
        id = i;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return ("Name:"+this.getName()+ " Age: "+ this.getAge() + " Id: "+ this.getId()+"]");
    }
}
