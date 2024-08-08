// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(sumDigits(3000));

    }

    public static int sumDigits(int x) {
        if(x < 0) {
            return -1;
        }

        int digitsAdded = 0;
        int digits = 0;
        int remNum = x;

        while(remNum > 0) {
            digits = remNum % 10;
            digitsAdded += digits;
            digits = 0;
            remNum = remNum/10;


        }

    return  digitsAdded;
    }
}