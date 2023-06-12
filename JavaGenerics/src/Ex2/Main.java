package Ex2;

public class Main {
    public static void main(String[] args) {


        PersonArrayList<Student> studentsList = new PersonArrayList<> ();

        Student ivan = new Student ("Ivan", 5);
        Student gosho = new Student ("Gosho", 10);
        Student maria = new Student ("Maria", 8);

        studentsList.addPerson (ivan);
        studentsList.addPerson (gosho);
        studentsList.addPerson (maria);
        studentsList.removePerson (ivan);

        PersonArrayList<Worker> workersList = new PersonArrayList<> ();

        Worker penka = new Worker ("Penka","accountant");
        Worker mitko = new Worker ("Mitko","driver");
        Worker viktoria = new Worker ("Viktoria", "architect");

        workersList.addPerson (penka);
        workersList.addPerson (mitko);
        workersList.addPerson (viktoria);
        workersList.removePerson (mitko);


        System.out.println (penka.getName ());
        System.out.println (ivan.getName ());
    }
}
