/**
 * @Author ZhangGJ
 * @Date 2019/09/04
 */
class FixedSizeStack<T> {
    private int index = 0;
    private Object[] storage;

    public FixedSizeStack(int size) {
        storage = new Object[size];
    }

    public void push(T item) {
        storage[index++] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        return (T) storage[--index];
    }
}


public class E32_FixedSizeStackTest {
    public static void main(String[] args) {
        FixedSizeStack<Integer> stack = new FixedSizeStack<Integer>(1);
        stack.push(1);
        System.out.println(stack.pop());
        try {
            stack.pop();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        stack = new FixedSizeStack<Integer>(1);
        stack.push(2);
        try {
            stack.push(2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}
