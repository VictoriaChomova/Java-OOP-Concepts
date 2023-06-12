package ConstructorProblem03;

public class Student {

    public String firstName;
    public String lastName;
    public int grade;
    public String gender;

    public Student() {

    }

    public Student(String fN, String lN, int grade, String gender) {
        this.firstName = fN;
        this.lastName = lN;
        this.grade = grade;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public String getGender() {
        return gender;
    }


    public void setFirstName(String fN) {
        this.firstName = fN;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
