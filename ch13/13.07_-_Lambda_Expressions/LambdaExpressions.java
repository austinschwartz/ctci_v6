import java.util.*;
import java.util.stream.*;

class Country {
  String continent;
  int population;
  String getContinent() {
    return continent;
  }
  int getPopulation() {
    return population;
  }
}
public class LambdaExpressions {
  public static int getPopulation(List<Country> countries, String continent) {
    Stream<Country> sublist = countries
                            .stream()
                            .filter(country -> { return country.getContinent().equals(continent);});

    Stream<Integer> populations = sublist.map(c -> c.getPopulation());

    int population = populations.reduce(0, (a, b) -> a + b);

    return population;
  }
  public static void main(String[] args) {
    Country a = new Country(); a.population = 55; a.continent = "A";
    Country b = new Country(); b.population = 125; b.continent = "B";
    Country c = new Country(); c.population = 2; c.continent = "A";
    List<Country> list = new ArrayList<Country>(){{
      add(a);
      add(b);
      add(c);
    }};
    System.out.println(getPopulation(list, "A"));
  }
}
