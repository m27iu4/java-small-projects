public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        this.pagesPrinted = 0;
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;

        if(tonerLevel > 100 || tonerLevel < 0) {
           this.tonerLevel = -1;

        }

    }

    public int addToner(int tonerAmount){

        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(tonerLevel + tonerAmount > 100) {
                return -1;
            }
            tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }

    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (duplex){
            pagesPrinted = pagesToPrint/2 + (pagesToPrint%2);
        } else {
            pagesPrinted = pagesToPrint;
        }

        return pagesPrinted;

    }


    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
