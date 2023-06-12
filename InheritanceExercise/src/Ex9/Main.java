package Ex9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        group.addStudent(new Student("John", "Doe", "123-456-7890"));
        group.addStudent(new Student("Jane", "Doe", "456-789-0123"));
        group.addTeacher(new Teacher("Mr.", "Smith", "789-012-3456"));
        group.addTeacher(new Teacher("Ms.", "Johnson", "321-654-9870"));
        group.display();
    }
}
