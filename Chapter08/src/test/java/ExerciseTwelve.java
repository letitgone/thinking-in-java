/**
 * @Author ZhangGJ
 * @Date 2019/04/11
 */
class Member {
		public Member(String id) {
				System.out.println("Member constructor " + id);
		}
}
class Rodent2 {
		Member m1 = new Member("r1"), m2 = new Member("r2");
		public Rodent2() { System.out.println("Rodent constructor"); }
		public void hop() { System.out.println("Rodent hopping"); }
		public void scurry() { System.out.println("Rodent scurrying"); }
		public void reproduce() { System.out.println("Making more Rodents"); }
		public String toString() { return "Rodent"; }
}
class Mouse2 extends Rodent2 {
		Member m1 = new Member("m1"), m2 = new Member("m2");
		public Mouse2() { System.out.println("Mouse constructor"); }
		public void hop() { System.out.println("Mouse hopping"); }
		public void scurry() { System.out.println("Mouse scurrying"); }
		public void reproduce() { System.out.println("Making more Mice"); }
		public String toString() { return "Mouse"; }
}
class Gerbil2 extends Rodent2 {
		Member m1 = new Member("g1"), m2 = new Member("g2");
		public Gerbil2() { System.out.println("Gerbil constructor"); }
		public void hop() { System.out.println("Gerbil hopping"); }
		public void scurry() { System.out.println("Gerbil scurrying"); }
		public void reproduce() { System.out.println("Making more Gerbils"); }
		public String toString() { return "Gerbil"; }
}
class Hamster2 extends Rodent2 {
		Member m1 = new Member("h1"), m2 = new Member("h2");
		public Hamster2() { System.out.println("Hamster constructor"); }
		public void hop() { System.out.println("Hamster hopping"); }
		public void scurry() { System.out.println("Hamster scurrying"); }
		public void reproduce() { System.out.println("Making more Hamsters"); }
		public String toString() { return "Hamster"; }
}
public class ExerciseTwelve {
		public static void main(String args[]) {
				new Hamster2();
		}
}
