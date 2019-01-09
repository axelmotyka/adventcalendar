package week02.exercise11;

public class RacingGame {
    public RacingGame() {
        Driver nikiLauda = new Driver("Niki Lauda", 1);
        System.out.println(nikiLauda);

        Driver louisHamilton = new Driver("Louis Hamilton", 2);
        System.out.println(louisHamilton);

        Driver michaelSchumacher = new Driver("Michael Schumacher", 3);
        System.out.println(michaelSchumacher);

        Driver fernandoAlonso = new Driver("Fernando Alonso", 4);
        System.out.println(fernandoAlonso);


        Vehicle skodaFabia = new Vehicle("Skoda", "Fabia", 25, Vehicle.EngineType.gasoline);
        System.out.println(skodaFabia);

        Vehicle vwPassat = new Vehicle("VW", "Passat", 192, Vehicle.EngineType.electric);
        System.out.println(vwPassat);

        Vehicle fordMustang = new Vehicle("Ford", "Mustang", 355, Vehicle.EngineType.gasoline);
        System.out.println(fordMustang);

        Vehicle porscheCayenne = new Vehicle("Porsche", "Cayenne", 295, Vehicle.EngineType.diesel);
        System.out.println(porscheCayenne);

    }

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();

    }

}
