/**
 * @Author ZhangGJ
 * @Date 2019/04/10
 */
class Cycle {
}
class Unicycle extends Cycle {
}
class Bicycle extends Cycle {
}
class Tricycle extends Cycle {
}
public class ExerciseOne {
		public static void ride(Cycle c) {}
		public static void main(String[] args) {
				ride(new Cycle());    // No upcasting
				ride(new Unicycle()); // Upcast
				ride(new Bicycle());  // Upcast
				ride(new Tricycle()); // Upcast
		}
}
