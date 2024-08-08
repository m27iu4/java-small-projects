// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    SmartKitchen smartKitchen = new SmartKitchen();
    smartKitchen.setKitchenState(false, false, false);
    smartKitchen.doKitchenWork();

    System.out.println("-".repeat(30));

    smartKitchen.pourMilk();
    smartKitchen.addWater();
    smartKitchen.doKitchenWork();

    System.out.println("-".repeat(30));
    smartKitchen.getBrewMaster().setHasWorkToDo(true);
    smartKitchen.getBrewMaster().brewCoffee();



    }
}