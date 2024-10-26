
class Logger {

    private static Logger instance = null;

    private Logger() {
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("     LOGGING SYSTEM ");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String LoggerName) {
        System.out.println("User " + LoggerName + " logged into the System");
    }
}

public class Application1 {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log(" Lakindu");

        Logger logger2 = Logger.getInstance();
        logger2.log(" Yasindu");

    }
}





