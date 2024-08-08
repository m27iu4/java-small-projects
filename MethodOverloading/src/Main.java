// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

       System.out.println(convertToCentimetres(7,12));

    }

    public static double convertToCentimetres(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimetres(int feet, int inches) {

        int feetToInches = feet * 12;
        double conversion = convertToCentimetres(feetToInches) + convertToCentimetres(inches);

        return conversion;
    }
}