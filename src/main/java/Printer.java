public class Printer {
    int sheets;
    int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public int getToner() {
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }

    public void print(int pages, int copies) {
        int sheetsNeeded = pages * copies;
        int tonerNeeded = sheetsNeeded;

        if (sheetsNeeded > sheets) {
            return;
        }

        if (tonerNeeded > toner) {
            return;
        }

        setSheets(sheets - sheetsNeeded);
        setToner(toner - tonerNeeded);
    }
}
