package c322.Homeworks.Homework4.PartB;

public class HeaderDecorator extends PrinterDecorator {
    private String header;
    public HeaderDecorator(Printer printer, String header) {
        super(printer);
        this.header = header;
    }
    @Override
    public void flushBuffer() {
        System.out.println("Adding Header: " + header);
        printer.flushBuffer();
    }
}