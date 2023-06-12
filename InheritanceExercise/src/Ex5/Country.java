package Ex5;
class Country {
    private String name;
    private String capital;
    private int population;

    Country(String name, String capital, int population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    String getName() {
        return name;
    }

    String getCapital() {
        return capital;
    }
    int getPopulation() {
        return population;
    }
}
