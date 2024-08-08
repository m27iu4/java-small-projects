// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

       System.out.println(getDurationString(3678));
       System.out.println(getDurationString(59, 60));

    }

    public static String getDurationString(int seconds) {

        if(seconds < 0 ) {
            return "Invalid value";
        }

            int minutes = seconds / 60;
            int remSeconds = seconds % 60;

        return getDurationString(minutes, remSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        int remMinutes = minutes % 60;
        int remSeconds = seconds % 60;

        return hours + " h " + remMinutes + " min " + remSeconds + " s ";
    }

}