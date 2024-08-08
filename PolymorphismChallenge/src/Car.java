public class Car {

    private String description;

    public Car(){

    }

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car is starting engine");
    };

    public void drive(){
        System.out.println("Driving a car " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Running a car engine of type " + description);
    }

}

class GasPowederCar extends Car {

    private double avgKmPerLitre;
    private  int cylinders;

    public GasPowederCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Running a gas powered car");
        System.out.println("Average km per litre is " + avgKmPerLitre);
        System.out.println("Number of cylinders is " + cylinders);
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Running an electric car");
        System.out.println("Average Km per change is " + avgKmPerCharge);
        System.out.println("Battery size is " + batterySize);

    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Running a hybrid car");
        System.out.println("Average km per litre is " + avgKmPerLitre);
        System.out.println("Battery size is " + batterySize);
        System.out.println("Number of cylinders is " + cylinders);
    }
}