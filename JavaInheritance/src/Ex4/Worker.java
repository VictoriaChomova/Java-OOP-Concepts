package Ex4;

public class Worker {
    public String firstName;
    public String lastName;
    public int salary;
    public int experience;
    public String position;




    public void show (){
        System.out.println ("Name: " + this.firstName + " " + this.lastName);
        System.out.println ("Salary: " + this.salary);
        System.out.println ("Experience: " + this.experience);
        System.out.println ("Position: " + this.position);
    }
}
