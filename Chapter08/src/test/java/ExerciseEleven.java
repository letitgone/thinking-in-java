/**
 * @Author ZhangGJ
 * @Date 2019/04/11
 */
class Meal {
		Meal() { System.out.println("Meal()"); }
}
class Bread {
		Bread() { System.out.println("Bread()"); }
}
class Cheese {
		Cheese() { System.out.println("Cheese()"); }
}
class Lettuce {
		Lettuce() { System.out.println("Lettuce()"); }
}
class Lunch extends Meal {
		Lunch() { System.out.println("Lunch()"); }
}
class PortableLunch extends Lunch {
		PortableLunch() { System.out.println("PortableLunch()");}
}
class Pickle {
		Pickle() { System.out.println("Pickle()"); }
}
class Sandwich2 extends PortableLunch {
		Bread b = new Bread();
		Cheese c = new Cheese();
		Lettuce l = new Lettuce();
		Pickle p = new Pickle();
		Sandwich2() { System.out.println("Sandwich()"); }
}
public class ExerciseEleven {
		public static void main(String args[]) {
				new Sandwich2();
		}
}
