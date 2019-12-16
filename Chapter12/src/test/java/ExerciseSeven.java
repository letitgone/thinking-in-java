import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @Author ZhangGJ
 * @Date 2019/06/02
 */
public class ExerciseSeven {
		private static Logger logger = Logger.getLogger("ExerciseSeven");
		static void logException(Exception e) {
				StringWriter trace = new StringWriter();
				e.printStackTrace(new PrintWriter(trace));
				logger.severe(trace.toString());
		}
		public static void main(String args[]) {
				char[] array = new char[10];
				try {
						array[10] = 'x';
				} catch(ArrayIndexOutOfBoundsException e) {
						logException(e);
				}
		}
}
