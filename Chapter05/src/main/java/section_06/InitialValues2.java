package section_06;

/**
 * @Author ZhangGJ
 * @Date 2019/04/01
 */
class Depth{

}
public class InitialValues2 {
		boolean bool = true;
		char ch = 'x';
		byte b = 47;
		short s = 0xff;
		int i = 999;
		long lng = 1;
		float f = 3.14f;
		double d = 3.14159;

		Depth depth = new Depth();

		int i1 = f();
		int f(){
				return 11;
		}

		int i2 = g();
		int j = h(i2);
		int g(){
				return 11;
		}
		int h(int n){
				return n * 10;
		}
}
