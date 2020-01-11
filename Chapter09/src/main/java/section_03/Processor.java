package section_03;

/**
 * important
 * @Author ZhangGJ
 * @Date 2019/04/17
 */
public interface Processor {
    String name();

    Object process(Object input);
}
