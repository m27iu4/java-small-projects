public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel , boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public Printer() {
        this(100, true);
    }

    public int addToner(int tonerAmount){
        tonerLevel += tonerAmount;
        if(tonerLevel > 100 || tonerLevel < 0){
            return -1;
        } else {
            return tonerLevel;
        }


    }

    public int printPages(int pages){

        int sheets = 0;

        if(duplex) {
            System.out.println("This is a duplex printer.");
            sheets =  pages / 2;
        } else {
            sheets =  pages;
        }

        pagesPrinted += sheets;

        return sheets;
    }
}
