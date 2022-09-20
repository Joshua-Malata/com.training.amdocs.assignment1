public class student {

    public void hosteler(){
        hosteler student1 = new hosteler("Jed",1023,909,101,30);

        System.out.println("Name: "+ student1.getName());
        System.out.println("Registration Number: "+student1.getRegistrationNo());
        System.out.println("Roll Number: "+student1.getRollNo());
        System.out.println("Hostel Number: "+student1.getHostelNo());
        System.out.println("Room Number: " + student1.getRoomNo());

    }

    public void day(){
        dayScholars student1 = new dayScholars("Mark",1230,101);

        System.out.println("Name: "+ student1.getName());
        System.out.println("Registration Number: "+student1.getRegistrationNo());
        System.out.println("Roll Number: "+student1.getRollNo());


    }

}
