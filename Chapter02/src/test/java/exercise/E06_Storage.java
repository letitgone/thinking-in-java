package exercise;

/**
 * @Author ZhangGJ
 * @Date 2019/03/17
 */
public class E06_Storage {
		String s = "Hello,World";
		int storage(String s){
				return s.length() * 2;
		}

		void print(){
				System.out.println(storage(s));
		}

		public static void main(String[] args) {
				E06_Storage e = new E06_Storage();
				e.print();
		}
}
