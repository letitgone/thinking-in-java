import java.util.Arrays;

/**
 * @Author ZhangGJ
 * @Date 2019/09/30
 */
class DataHolder {
    protected int data;

    DataHolder(int data) {
        this.data = data;
    }
}


class DataHolderWithEquals extends DataHolder {
    DataHolderWithEquals(int data) {
        super(data);
    }

    public boolean equals(Object o) {
        return o instanceof DataHolderWithEquals && data == ((DataHolder) o).data;
    }
}


public class E19_ArrayEquals {
    public static void main(String[] args) {
        DataHolder[] a1 = new DataHolder[5];
        DataHolder[] a2 = new DataHolder[5];
        Arrays.fill(a1, new DataHolder(1));
        Arrays.fill(a2, new DataHolder(1));
        System.out.println(Arrays.equals(a1, a2));
        Arrays.fill(a1, new DataHolderWithEquals(1));
        Arrays.fill(a2, new DataHolderWithEquals(1));
        System.out.println(Arrays.equals(a1, a2));
    }
}
