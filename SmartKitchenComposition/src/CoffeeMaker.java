public class CoffeeMaker extends Refrigerator {

    public CoffeeMaker() {
    }

    public void brewCoffee() {
        if(isHasWorkToDo()) {
            System.out.println("CofeeMaker -> brewing coffee");
        }
        setHasWorkToDo(false);

    }
}
