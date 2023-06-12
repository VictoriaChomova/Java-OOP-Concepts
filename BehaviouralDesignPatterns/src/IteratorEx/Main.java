package IteratorEx;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Create an array of persons
        Person[] persons = {
                new Person ("Ivan", 28),
                new Person ("Victoria", 27),
                new Person ("Boyana", 1),
        };

        // Get an iterator for the array

        Iterator<Person> iterator = new PersonIterator (persons);

        // Use the iterator to loop through the array

        while (iterator.hasNext ()) {
            Person person = iterator.next ();
            System.out.println ("Name: " + person.getName () + "\nAge: " + person.getAge ());
        }
    }
}
