package Ex2;

import java.util.ArrayList;
import java.util.List;

public class PersonArrayList<O extends Person> {

    List<O> personsList;


    public PersonArrayList() {
        this.personsList = new ArrayList<> ();
    }


    public void addPerson(O person) {
        this.personsList.add (person);
        System.out.println (person.getName () + " is added to the list.");
    }


    public void removePerson (O person) {
        this.personsList.remove (person);

        System.out.println (person.getName () + " is removed from the list.");
    }

    public String getName (O person) {
        return person.getName ();
    }


}
