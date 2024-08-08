// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int x=5;
        int numberEven = 0;
        int numberOdd = 0;
        while(x <= 20) {
            if(isEvenNumber(x)) {
                System.out.println(x);
                numberEven+=1;
            } else {
                numberOdd+=1;
            }

            if(numberEven >=5) {
                break;
            }

            x+=1;


        }

        int totalNumber = numberOdd + numberEven;

        System.out.println("Even total: " + numberEven);
        System.out.println("Total numbers: " + totalNumber);
    }

    public static boolean isEvenNumber(int x) {

        return x % 2 == 0;
    }
}