package week02.exercise12;

import java.awt.*;

public class RacingGame {
    public RacingGame() {
        // 1. line: Generates/constructs an object from class Driver and passes two arguments.
        // 2. line: Prints out the content of the call of nikiLaude-method.
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
        Vehicle skodaFabia1 = new Vehicle("Skoda", "Fabia", 25, Vehicle.EngineType.diesel);
        System.out.println(skodaFabia1);

        Trike trike = new Trike("Honda", "Kazuyoshi", 30, Vehicle.EngineType.diesel, "black");
        System.out.println(trike);

        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Donald", 45, Vehicle.EngineType.gasoline, true);
        System.out.println(motorcycle);

        Tank tank = new Tank("Krauss Maffei", "Leolang", 90, Vehicle.EngineType.diesel, 500);
        System.out.println(tank);


    }


    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();

    }
}
