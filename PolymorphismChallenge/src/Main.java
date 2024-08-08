// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car car = new GasPowederCar("gas", 5, 4);
        runRace(car);

        System.out.println("***************************************");

        Car car2 = new HybridCar("Hybrid", 5, 34, 8);
        car2.startEngine();
        car2.drive();


    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}