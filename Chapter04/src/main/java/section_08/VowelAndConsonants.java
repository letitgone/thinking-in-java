package section_08;

import java.util.Random;

/**
 * @Author ZhangGJ
 * @Date 2019/03/25
 */
public class VowelAndConsonants {
		public static void main(String[] args) {
				Random rand = new Random(47);
				for(int i = 0; i < 100; i++) {
						// rand.nextInt(26)产生0-25的随机int值，它被加到a上，这里a将被自动转换成int执行加法
						int c = rand.nextInt(26) + 'a';
						System.out.print((char)c + ", " + c + ": ");
						switch(c) {
						case 'a':
						case 'e':
						case 'i':
						case 'o':
						case 'u': System.out.println("vowel");
							break;
						case 'y':
						case 'w': System.out.println("Sometimes a vowel");
							break;
						default:  System.out.println("consonant");
					  } 
				}
		}
}
