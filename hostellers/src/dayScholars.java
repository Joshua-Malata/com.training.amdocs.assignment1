public class dayScholars {
    private String name ;
    private int registrationNo;
    private int rollNo;


    public dayScholars(String name,int registrationNo, int rollNo){
        super();
        this.name = name;
        this.registrationNo = registrationNo;
        this.rollNo = rollNo;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setRegistrationNo(int registrationNo){
        this.registrationNo = registrationNo;
    }

    public int getRegistrationNo(){
        return this.registrationNo;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public int getRollNo(){
        return this.rollNo;
    }

}
