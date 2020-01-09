package section_01;

/**
 * Wind objects are instruments
 * because they have the same interface:
 *
 * @Author ZhangGJ
 * @Date 2019/04/10
 */
public class Wind extends Instrument {
    /**
     * Redefine interface method:
     * @param n
     */
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
