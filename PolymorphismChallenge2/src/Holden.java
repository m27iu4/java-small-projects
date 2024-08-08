public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Holden -> Starting engine...";
    }

    public String accelerate() {
        return "Holden -> Accelerating...";
    }

    public String brake() {
        return "Holden -> Breaking...";
    }
}
