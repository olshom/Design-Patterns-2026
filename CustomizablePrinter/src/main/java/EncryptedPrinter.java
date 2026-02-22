public class EncryptedPrinter extends PrinterDecorator {
    //Caesar cipher with a shift of 3
    private static final int SHIFT = 3;

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        printer.print(encrypt(text));
    }

    private String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - base + SHIFT) % 26 + base));
            } else {
                result.append(c); // keep spaces, punctuation, XML tags as-is
            }
        }
        return result.toString();
    }
}
