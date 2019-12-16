package section_02;

/**
 * @Author ZhangGJ
 * @Date 2019/10/04
 */
public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
