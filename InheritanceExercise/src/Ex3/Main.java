package Ex3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(new CapitalCity("Sofia", 1300000));
        cities.add(new SeasideCity("Varna", 330000));
        cities.add(new SeasideCity("Burgas", 200000));
        cities.add(new City("Plovdiv", 350000));
        cities.add(new City("Ruse", 150000));

        for (City city : cities) {
            System.out.println(city.getName() + " - Population: " + city.getPopulation());
        }
    }
}