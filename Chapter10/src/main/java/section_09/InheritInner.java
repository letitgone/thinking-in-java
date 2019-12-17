package section_09;

/**
 * @Author ZhangGJ
 * @Date 2019/05/23
 */
class WithInner {
    class Inner {
    }
}


public class InheritInner extends WithInner.Inner {
    //! InheritInner() {} // Won’t compile
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
