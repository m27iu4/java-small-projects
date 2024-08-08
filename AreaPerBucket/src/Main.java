// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        // Press Ctrl+D to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Cmd+F8.

        System.out.println(getBucketCount(2.75,3.25,2.5,1));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        if(extraBuckets == 0){
            double exZero = Math.ceil(width*height / areaPerBucket);
            return (int)exZero;
        }

        double areaToCover = width * height;
        double doable = Math.ceil((areaToCover - (extraBuckets * areaPerBucket)) / areaPerBucket);

        return (int)doable;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double areaToCover = width * height;
        double bucketsToBuy = Math.ceil(areaToCover / areaPerBucket);

        return (int)bucketsToBuy;
    }

    public static int getBucketCount(double area, double areaPerBucket){

        if(area <=0 || areaPerBucket <=0){
            return -1;
        }

        double bucketsToBuy = Math.ceil(area / areaPerBucket);

        return (int)bucketsToBuy;
    }
}