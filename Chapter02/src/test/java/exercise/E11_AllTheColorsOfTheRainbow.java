package exercise;

/**
 * @Author ZhangGJ
 * @Date 2019/03/17
 */
public class E11_AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        E11_AllTheColorsOfTheRainbow all = new E11_AllTheColorsOfTheRainbow();
        all.changeTheHueOfTheColor(27);
    }
}
