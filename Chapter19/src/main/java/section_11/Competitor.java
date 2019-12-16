package section_11;

/**
 * @Author ZhangGJ
 * @Date 2019/10/04
 */
public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
}
