package section_08;

import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/06/03
 */
public class Switch {
		private boolean state = false;

		public boolean read() {
				return state;
		}

		public void on() {
				state = true;
				print(this);
		}

		public void off() {
				state = false;
				print(this);
		}

		public String toString() {
				return state ? "on" : "off";
		}
}
