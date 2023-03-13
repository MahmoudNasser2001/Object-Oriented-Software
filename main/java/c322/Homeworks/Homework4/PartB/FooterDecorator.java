package c322.Homeworks.Homework4.PartB;

public class FooterDecorator extends PrinterDecorator {
    private String footer;
    public FooterDecorator(Printer printer, String footer) {
        super(printer);
        this.footer = footer;
    }
    @Override
    public void flushBuffer() {
        printer.flushBuffer();
        System.out.println("Adding Footer: " + footer);
    }
}