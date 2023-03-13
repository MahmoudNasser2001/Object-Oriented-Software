package c322.Homeworks.Homework4.PartB;
public class Main {
    public static void main(String[] args) {
        Printer printer = new ConcretePrinter();
        printer = new HeaderDecorator(printer, "My Header");
        printer = new FooterDecorator(printer, "My Footer");

        printer.flushBuffer();
    }
}