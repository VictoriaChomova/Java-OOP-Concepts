package Ex9;

import java.util.ArrayList;



class Group {
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;

    Group() {
        this.students = new ArrayList<Student>();
        this.teachers = new ArrayList<Teacher>();
    }
    void addStudent(Student student) {
        students.add(student);
    }

    void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    void display() {
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname() + " " + student.getPhone());
        }
        System.out.println("\nTeachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName() + " " + teacher.getSurname() + " " + teacher.getPhone());
        }
    }
}