public class Students {

    private String name;
    private int rollNo;
    private String college;


    public Students(String name,int rollNo, String college) {
        this.name = name;
        this.college = college;
        this.rollNo = rollNo;
    }


    @Override
    public String toString() {
        return "Students Studying: \nRoll Number: "+rollNo+"\nName: " + name + "\nCollege: " + college+"";
    }

}
