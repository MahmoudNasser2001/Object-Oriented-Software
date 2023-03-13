package c322.Homeworks.Homework4.PartB;

public abstract class PrinterDecorator extends Printer {
    protected Printer printer;
    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }
}