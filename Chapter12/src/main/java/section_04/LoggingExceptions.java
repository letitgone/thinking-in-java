package section_04;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @Author ZhangGJ
 * @Date 2019/06/02
 */
class LoggingException extends Exception {
		private static Logger logger = Logger.getLogger("LoggingException");
		public LoggingException() {
				StringWriter trace = new StringWriter();
				printStackTrace(new PrintWriter(trace));
				logger.severe(trace.toString());
		}
}
public class LoggingExceptions {
		public static void main(String[] args) {
				try {
						throw new LoggingException();
				} catch(LoggingException e) {
						System.err.println("Caught " + e);
				}
				try {
						throw new LoggingException();
				} catch(LoggingException e) {
						System.err.println("Caught " + e);
				}
		}
}
