public class LambdaExpressions {
  int getPopulation(List<Country> countries, String continent) {
    Stream<Integer> populations = countries.stream().map(c -> c.getContinent().equals(continent) ? c.getPopulation() : 0);
    return populations.reduce(0, (a, b) -> a + b);
  }
}
