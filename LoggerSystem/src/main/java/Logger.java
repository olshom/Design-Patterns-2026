import java.io.*;

public class Logger {
    private static Logger logger;
    private Writer writer;
    private BufferedWriter bufferedWriter;

    private Logger() throws IOException {
        this.writer = new FileWriter("defaultName.txt");
         this.bufferedWriter= new BufferedWriter(this.writer);
    }

    public static Logger getInstance() throws IOException {
        if (logger == null){
            logger = new Logger();
        }
        return logger;
    }
    public void setFileName(String fileName) throws IOException {
        this.bufferedWriter.flush();
        this.writer = new FileWriter(fileName);
        this.bufferedWriter= new BufferedWriter(this.writer);

    }
    public void write (String text) throws IOException {
        this.bufferedWriter.write(text);
        this.bufferedWriter.newLine();
    }
    public void close() throws IOException {
        bufferedWriter.flush();
    }
}
