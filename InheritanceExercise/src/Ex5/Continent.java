package Ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Continent {
    ArrayList<Country> countries;

    public Continent(ArrayList<Country> countries) {
        this.countries = countries;
    }

     void addCountry(Country country) {
        countries.add(country);
    }

    void display() {
        System.out.println("Countries:");
        for (Country country : countries) {
            System.out.println(country.getName() + " - " + country.getCapital() + " - " + country.getPopulation());
        }
    }
}