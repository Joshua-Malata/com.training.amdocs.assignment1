import java.util.*;
public class Main {
    public static Candidate getCandidateDetails() throws InvalidSalaryException
    {
        System.out.println("Enter the candidate Details");
        Scanner sc = new Scanner(System.in);
        Candidate candidate = new Candidate();
        System.out.println("Name: ");
        String name = sc.nextLine();
        candidate.setName(name);
        System.out.println("Gender: ");
        String gender = sc.nextLine();
        candidate.setGender(gender);
        System.out.println("Excepted Salary: ");
        double sal = sc.nextDouble();
        if(sal<10000)
        {
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10,000.");
        }
        else
        {
            candidate.setExpectedSalary(sal);
            return candidate;
        }
    }
    public static void main(String args[])
    {
        Main exp = new Main();

        try {
            exp.getCandidateDetails();
            System.out.println("REGISTRATION SUCCESSFUL!");
        }
        catch(InvalidSalaryException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
