public class SmartKitchen {
    private CofeeMaker cofeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;



    public SmartKitchen() {
        this.cofeeMaker = new CofeeMaker();
        this.dishWasher = new DishWasher();
        this.refrigerator = new Refrigerator();
    }


    public void addWater() {
        cofeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk() {
        refrigerator.setHasWorkToDo(true);
    }

    public void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffee, boolean dishes, boolean refrigerator) {
        this.cofeeMaker.setHasWorkToDo(coffee);
        this.dishWasher.setHasWorkToDo(dishes);
        this.refrigerator.setHasWorkToDo(refrigerator);

    }

    public void doKitchenWork() {

        cofeeMaker.brewCoffee();
        refrigerator.orderFood();
        dishWasher.doDishes();

    }
}

class CofeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if(hasWorkToDo) {
            System.out.println("Brewing coffee");
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if(hasWorkToDo) {
            System.out.println("Washing dishes");
        }
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("Ordering food");
        }
    }
}
