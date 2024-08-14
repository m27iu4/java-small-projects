import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int len) {

        int[] arr = new int[len];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        for(int i=0; i<len; i++) {
            String element = scanner.nextLine();
            arr[i] = Integer.parseInt(element);
        }

    return arr;

    };

    public static int[] sortIntegers(int[] arr) {

        int[] sortedArr = Arrays.copyOf(arr,arr.length);
        int [] originalArray = Arrays.copyOf(arr,arr.length);

        Arrays.sort(originalArray);

        for(int i=originalArray.length-1; i>=0; i--) {

            sortedArr[sortedArr.length-1-i]  = originalArray[i];
        }

        if(Arrays.equals(sortedArr, arr)) {
            Arrays.sort(arr);
            return arr;
        }

        return sortedArr;

    };

    public static void printArray(int[] arr) {

        int[] toPrint = sortIntegers(arr);

        for(int i =0; i<arr.length; i++) {
            System.out.println("Element " + i + " contents " + toPrint[i]);
        }

    };


}
