import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemoPractice {
    public static Logger log= LogManager.getLogger(Log4jDemoPractice.class);

    public static void main(String[] args) {
        System.out.println("Here we are learning Log4j");

        log.info("This is the info message");
        log.debug("This is the debug message");
        log.error("This is the error message");
        log.warn("This is the warning message");
        log.fatal("This is the fatal message");
        log.trace("This is the trace message at: time {}", System.currentTimeMillis());



    }
}

