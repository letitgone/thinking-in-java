package section_04;

class Letter{
		char c;
}
/**
 * 方法调用中的别名问题
 * @Author ZhangGJ
 * @Date 2019/03/18
 */
public class PassObject {
		static void f(Letter y){ // 对象赋值 y=x,都指向x，因此x.c和y.c都是一样的效果
				y.c = 'z';
		}
		public static void main(String[] args) {
				Letter x = new Letter();
				x.c = 'a';
				System.out.println("1: x.c: " + x.c);
				f(x);
				System.out.println("2: x.c: " + x.c);
		}
}
