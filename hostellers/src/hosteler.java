public class hosteler {
    private String name ;
    private int registrationNo;
    private int rollNo;
    private int hostelNo ;
    private int roomNo ;

    public hosteler(String name,int registrationNo, int rollNo, int hostelNo, int roomNo){
        super();
        this.name = name;
        this.registrationNo = registrationNo;
        this.rollNo = rollNo;
        this.hostelNo = hostelNo;
        this.roomNo = roomNo;
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

    public void setHostelNo(int hostelNo){
        this.hostelNo = hostelNo;
    }

    public int getHostelNo(){
        return this.hostelNo;
    }

    public void setRoomNo(int roomNo){this.roomNo = roomNo;}

    public int getRoomNo(){
        return this.roomNo;
    }
}
