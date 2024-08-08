import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(getInputFromScanner());
    }

    public static String getInputFromScanner() {

        boolean c = false;
        int max = 0;
        int min = 0;
        int initialize = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your number: ");
            try{

                String x = scanner.nextLine();
                c = checker(x);

                if(Integer.parseInt(x)>max) {
                    max = Integer.parseInt(x);
                }

                if(min < Integer.parseInt(x)) {
                    min += Integer.parseInt(x);
                    if(min > Integer.parseInt(x)) {
                        min -=Integer.parseInt(x);
                    }
                } else if (Integer.parseInt(x) == 1) {
                    min = 1;
                } else {
                    min = 0;
                }


            } catch (NumberFormatException nfe) {
                System.out.println("Not a valid entry");
                c = !c;
            }

        } while (c);

        return "The max is " + max +" and min is " + min;
    }

    public static boolean checker(String x){
        int y = Integer.parseInt(x);

        return y == Integer.parseInt(x);

    }





}