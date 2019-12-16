package section_04;

/**
 * @Author ZhangGJ
 * @Date 2019/03/28
 */

class Person{
		public void eat(Apple apple){
				Apple peeled = apple.getPeeled();
				System.out.println("Yummy");
		}
}

class Peeler{
		static Apple peel(Apple apple){
				// ...remove peel
				return apple; // Peeled
		}
}

class Apple{
		Apple getPeeled(){
				return Peeler.peel(this);
		}
}

public class PassingThis {
		public static void main(String[] args) {
				new Person().eat(new Apple());
		}
}
