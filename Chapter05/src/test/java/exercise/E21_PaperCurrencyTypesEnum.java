package exercise;

enum PaperCurrencyTypes {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}

/**
 * @Author ZhangGJ
 * @Date 2019/04/04
 */
public class E21_PaperCurrencyTypesEnum {
    public static void main(String args[]) {
        PaperCurrencyTypes[] s1 = PaperCurrencyTypes.values();
        for (PaperCurrencyTypes s : PaperCurrencyTypes.values())
            System.out.println(s + ", ordinal " + s.ordinal());
    }
}
