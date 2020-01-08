package section_08;

/**
 * @Author ZhangGJ
 * @Date 2020/01/09 07:05
 */
public class WithFinals {
    // Identical to "private" alone:
    private final void f() {
        System.out.println("WithFinals.f()");
    }

    // Also automatically "final":
    private void g() {
        System.out.println("WithFinals.g()");
    }
}
