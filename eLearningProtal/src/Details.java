public class Details {
    private int studentId;
    private String studName;
    private String studAdd;
    private  String course;
    private String sched;

    public Details() {

    }

    public Details(int id,String name,String add, String cour, String sch)
    {
        studentId=id;
        studName=name;
        studAdd=add;
        course=cour;
        sched=sch;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudAdd() {
        return studAdd;
    }

    public void setStudAdd(String studAdd) {
        this.studAdd = studAdd;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSched(String sched){
        this.sched = sched;
    }

    public String getSched(){
        return this.sched;
    }
}


