package StudentsAdapter;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        Student s = new Student ();
        s.name = "Viktoria Chomova";

        try {
            FileOutputStream fos = new FileOutputStream("file1.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // write object to file
            oos.writeObject(s);
            // closing resources
            oos.close();
            fos.close();

        } catch (Exception e) {
            System.out.println ("Something went wrong.");
        }
    }
}
