// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("1 is" + (isPrime(1) ? " prime " : " not " + " prime "));
        System.out.println("2 is" + (isPrime(2) ? " prime " : " not " + " prime "));
        System.out.println("3 is" + (isPrime(3) ? " prime " : " not " + " prime "));
        System.out.println("9 is" + (isPrime(9) ? " prime " : " not " + " prime "));
        System.out.println("17 is" + (isPrime(17) ? " prime " : " not " + " prime "));
    }

    public static boolean isPrime(int x) {

        int numberOfPrimes = 0;

        if(x==2) return x == 2;

        for(int i=2; i<=x/2; i++){
            if(x%i == 0) {
                return false;
            } else {
                numberOfPrimes++;
            }

            if(numberOfPrimes == 3) {
                break;
            }
        }


        System.out.println("Number of primes = " + numberOfPrimes);

        return true;
    };
}