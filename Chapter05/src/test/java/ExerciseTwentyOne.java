/**
 * @Author ZhangGJ
 * @Date 2019/04/04
 */
enum PaperCurrencyTypes {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}


public class ExerciseTwentyOne {
    public static void main(String args[]) {
        PaperCurrencyTypes[] s1 = PaperCurrencyTypes.values();
        for (PaperCurrencyTypes s : PaperCurrencyTypes.values())
            System.out.println(s + ", ordinal " + s.ordinal());
    }
}
