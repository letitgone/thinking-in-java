package section_10;

import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
enum LikeClasses {
    WINKEN {
        void behavior() {
            print("Behavior1");
        }
    }, BLINKEN {
        void behavior() {
            print("Behavior2");
        }
    }, NOD {
        void behavior() {
            print("Behavior3");
        }
    };

    abstract void behavior();
}


public class NotClasses {
    // void f1(LikeClasses.WINKEN instance) {} // Nope
}
