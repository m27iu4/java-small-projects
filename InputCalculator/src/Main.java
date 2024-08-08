import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int count = 0;



        do {

            System.out.println("Enter number: ");
            try {
                count++;
                sum+=Integer.parseInt(scanner.nextLine());
                avg = (double)sum / count;


            } catch (NumberFormatException nfe) {
                System.out.println("SUM= " + sum + " AVG: " + Math.round(avg));
                break;
            }


        }
        while(true);
    }
}