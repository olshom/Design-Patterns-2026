public class XMLPrinter extends PrinterDecorator {

    public XMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        printer.print("<message>"+text+"</message>");
    }
}
