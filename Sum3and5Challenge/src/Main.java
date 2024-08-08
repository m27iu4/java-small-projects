// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int num = 0;
        for(int i=1; i<=1000; i++) {
            if(i%3 == 0 && i%5 == 0) {
                sum+=i;
                num+=1;
                System.out.println(i);
            }

            if(num == 5) {
                break;
            }
        }

        System.out.println("The sum is " + sum);
    }
}