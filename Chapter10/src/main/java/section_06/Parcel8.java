package section_06;

class Wrapping {
    private int i;

    public Wrapping(int x) {
        i = x;
    }

    public int value() {
        return i;
    }
}

/**
 * @Author ZhangGJ
 * @Date 2019/05/07
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
        // Base constructor call:
        // Pass constructor argument.
        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value() * 47;
            }
        }; // Semicolon required
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
