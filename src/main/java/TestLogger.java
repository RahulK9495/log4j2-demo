import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogger {

	
	private static final Logger logger = LogManager.getLogger(TestLogger.class);
	
	public static void main(String[] args) throws InterruptedException {
		
		logger.debug(">>> Debug message ");
		logger.info(">>> info message ");
		logger.warn(">>> warn message ");
		logger.error(">>> error message ");
		logger.fatal(">>> fatal message ");

		Thread.sleep(65000);
		logger.debug(">>> Debug message ");
		logger.info(">>> info message ");
		logger.warn(">>> warn message ");
		logger.error(">>> error message ");
		logger.fatal(">>> fatal message ");
	}
}
