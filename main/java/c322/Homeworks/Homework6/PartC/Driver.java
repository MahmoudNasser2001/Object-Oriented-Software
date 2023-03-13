package c322.Homeworks.Homework6.PartC;

public class Driver {
    public static void main(String[] args) {

        PrinterOffLine initialPrinterState = new PrinterOffLine();

        Printer printer = new Printer(initialPrinterState);

        System.out.println("\n");

        printer.pushPrint();

        printer.pushPrint();

        printer.pushPrint();

        System.out.println("\n\n");

    }
}