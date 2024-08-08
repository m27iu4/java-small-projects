public class NumberToWords {
    public static int getDigitCount(int x) {
        if (x < 0) {
            return -1;
        }
        if (x == 0) {
            return 1;
        }
        int countDigit = 0;

        for (int i = x; i > 0; i /= 10) {
            countDigit += 1;
        }
        return countDigit;
    }


    //REVERSING NUMBER

    public static int reverse(int reversedNumber) {

        //NEGATIVE
        if (reversedNumber < 0) {
            reversedNumber *= -1;
            int countDigit = getDigitCount(reversedNumber);
            int lastDig;
            int newNumber = 0;


            for (int i = reversedNumber; i > 0; i /= 10) {

                lastDig = i % 10;

                newNumber += lastDig * Math.pow(10, countDigit - 1);

                countDigit--;

            }


            return newNumber *= -1;
        }

        //POSITIVE

        int countDigit = getDigitCount(reversedNumber);
        int lastDig;
        int newNumber = 0;


        for (int i = reversedNumber; i > 0; i /= 10) {

            lastDig = i % 10;

            newNumber += lastDig * Math.pow(10, countDigit - 1);

            countDigit--;

        }


        return newNumber;
    }

    //NUMBER TO WORDS

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int countDigit = getDigitCount(number); // equals 5
        int numberToBeShown = reverse(number); // Prints 321


        int lastDigit;

        for (int i = numberToBeShown; i > 0; i /= 10) {

            lastDigit = i % 10;

            switch (lastDigit) {
                case 9:
                    System.out.println("Nine");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
            }

            countDigit--;

        }

        for (int i = countDigit; i > 0; i--) {
            System.out.println("Zero");
        }


    }
}
