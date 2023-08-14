import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    public Printer printer;

    @Before
    public void before() {
        printer = new Printer(10, 20);
    }

    @Test
    public void hasSheets() {
        assertEquals(10, printer.getSheets());
    }

    @Test
    public void hasToner() {
        assertEquals(20, printer.getToner());
    }

    @Test
    public void printingUsesSheets() {
        printer.print(2, 3);
        assertEquals(4, printer.getSheets());
    }

    @Test
    public void printingUsesToner() {
        printer.print(2, 3);
        assertEquals(14, printer.getToner());
    }

    @Test
    public void insufficientSheets() {
        printer.print(5, 5);
        assertEquals(10, printer.getSheets());
    }

    @Test
    public void insufficientToner() {
        Printer lowTonerPrinter = new Printer(10, 2);
        lowTonerPrinter.print(5, 2);
        assertEquals(10, printer.getSheets());
    }
}
