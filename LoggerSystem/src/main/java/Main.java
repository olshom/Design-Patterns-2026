import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getInstance();
        logger.write("Simulation started");
        logger.setFileName("new_log.txt"); // Change file name
        logger.write("Simulation started");
        logger.write("Processing data...");
        logger.write("Simulation finished");
        logger.close(); // Remember to close the logger
    }
}