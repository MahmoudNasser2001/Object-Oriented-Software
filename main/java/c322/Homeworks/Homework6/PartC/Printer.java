package c322.Homeworks.Homework6.PartC;

public class Printer {

    private PrinterController printerState;

    public Printer(PrinterController pState) {
        this.printerState = pState;
    }

    public PrinterController getPrinterState() {
        return printerState;
    }

    public void setPrinterState(PrinterController pState) {
        this.printerState = pState;
    }

    public void pushPrint() {
        printerState.pushPrint(this);
    }
}