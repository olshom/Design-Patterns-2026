public abstract class PrinterDecorator implements Printer{
    Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }
}
