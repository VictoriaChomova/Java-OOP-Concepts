package Ex5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Continent continent = new Continent (new ArrayList<Country> ());

        continent.addCountry (new Country ("Canada", "Ottawa", 38000000));
        continent.addCountry (new Country ("Mexico", "Mexico City", 126200000));
        continent.addCountry (new Country ("Brazil", "Brasília", 209500000));
        continent.addCountry (new Country ("Argentina", "Buenos Aires", 44000000));
        continent.display ();
    }
}