import java.util.*;
public class Func {
    private List<Details> detailsList = new ArrayList<Details>();
    private List<Details> detailsList1= new ArrayList<Details>();
    public void setDetailsList (List<Details> detailS){
        detailsList = detailS;
    }
    public List<Details> getDetailsList(){
        return detailsList;
    }

    public void addStudent(Details addStudObj){
        detailsList.add(addStudObj);
    }

    public List<Details> viewStudents(){
        return detailsList;
    }

    public void addCourse(Details addCourse){
        detailsList1.add(addCourse);
    }

    public List<Details> viewCourse(){
        return detailsList1;
    }

    public List<Details> searchCourse(String course){
        List<Details> cList = new ArrayList<Details>();
        for (Details c : detailsList1){
            if (c.getCourse().equalsIgnoreCase(course)){
                cList.add(c);
            }
        }
        return cList;
    }
}
