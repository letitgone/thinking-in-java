/**
 * @Author ZhangGJ
 * @Date 2019/04/04
 */
public class ExerciseTwentyTwo {
		static void describe(PaperCurrencyTypes pct) {
				System.out.print(pct + " has a portrait of ");
				switch(pct) {
						case ONE:
								System.out.println("George Washington");
								break;
						case TWO:
								System.out.println("Thomas Jefferson");
								break;
						case FIVE:
								System.out.println("Abraham Lincoln");
								break;
						case TEN:
								System.out.println("Alexander Hamilton");
								break;
						case TWENTY:
								System.out.println("Andrew Jackson");
								break;
						case FIFTY:
								System.out.println("U.S. Grant");
								break;
				}
		}
		public static void main(String args[]) {
				for(PaperCurrencyTypes s : PaperCurrencyTypes.values()) {
						describe(s);
				}
		}
}
