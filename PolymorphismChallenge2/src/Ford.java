public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Ford -> Starting engine...";
    }

    public String accelerate() {
        return "Ford -> Accelerating...";
    }

    public String brake() {
        return "Ford -> Breaking...";
    }
}
