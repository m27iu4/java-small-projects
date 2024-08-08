public class SmartKitchen {

    CoffeeMaker brewMaster;
    DishWasher dishWasher;
    Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean brewFlag, boolean iceFlag, boolean dishFlag) {
        brewMaster.setHasWorkToDo(brewFlag);
        iceBox.setHasWorkToDo(iceFlag);
        dishWasher.setHasWorkToDo(dishFlag);
    }

    public void doKitchenWork() {
        if (brewMaster.isHasWorkToDo()) {
            brewMaster.brewCoffee();
        } else {
            System.out.println("brewFlag is false");
        }
        if (dishWasher.isHasWorkToDo()) {
            dishWasher.doDishes();
        } else {
            System.out.println("dishFlag is false");
        }
        if (iceBox.isHasWorkToDo()) {
            iceBox.orderFood();
        } else {
            System.out.println("iceFlag is false");
        }
    }
}
