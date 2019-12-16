/**
 * @Author ZhangGJ
 * @Date 2019/04/11
 */
class Rodent {
		public void hop() { System.out.println("Rodent hopping"); }
		public void scurry() { System.out.println("Rodent scurrying"); }
		public void reproduce() { System.out.println("Making more Rodents"); }
		public String toString() { return "Rodent"; }
}
class Mouse extends Rodent {
		public void hop() { System.out.println("Mouse hopping"); }
		public void scurry() { System.out.println("Mouse scurrying"); }
		public void reproduce() { System.out.println("Making more Mice"); }
		public String toString() { return "Mouse"; }
}
class Gerbil extends Rodent {
		public void hop() { System.out.println("Gerbil hopping"); }
		public void scurry() { System.out.println("Gerbil scurrying"); }
		public void reproduce() { System.out.println("Making more Gerbils"); }
		public String toString() { return "Gerbil"; }
}
class Hamster extends Rodent {
		public void hop() { System.out.println("Hamster hopping"); }
		public void scurry() { System.out.println("Hamster scurrying"); }
		public void reproduce() { System.out.println("Making more Hamsters"); }
		public String toString() { return "Hamster"; }
}
public class ExerciseNine {
		public static void main(String args[]) {
				Rodent[] rodents = {
						new Mouse(),
						new Gerbil(),
						new Hamster(),
				};
				for(Rodent r : rodents) {
						r.hop();
						r.scurry();
						r.reproduce();
						System.out.println(r);
				} 
		}
}
