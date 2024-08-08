// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        printDayOfWeek(1);
    }
    public static void printDayOfWeek(int day) {

       String dayOfTheWeek = switch (day) {
           case 0 -> {yield "Sunday";}
           case 1 -> "Monday";
           case 2 -> "Tuesday";
           case 3 -> "Thursday";
           case 4 -> "Friday";
           default -> "Incalid";
       };

       System.out.println("Day is " + dayOfTheWeek);
    }


}