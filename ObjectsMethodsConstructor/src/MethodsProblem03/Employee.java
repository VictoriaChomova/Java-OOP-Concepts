package MethodsProblem03;

public class Employee {

    public String fistName;
    public String lastName;
    public int age;
    public String position;

    public void printEmployee() {
        //Name: Ivan Ivanov
        //Age: 34
        //Position: Manager
        if (this.age > 0) {
            System.out.println("Name: " + fistName + " " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Position: " + position);
        } else {
            System.out.println("Invalid age input!");
        }
    }
}
