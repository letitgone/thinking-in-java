/**
 * @Author ZhangGJ
 * @Date 2019/12/11
 */
public class Child extends Base {
    private long sum;

    @Override
    public void add(int number) {
        super.add(number);
        sum += number;
    }

    @Override
    public void addAll(int[] numbers) {
//        super.addAll(numbers);
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
    }

    public long getSum() {
        return sum;
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.addAll(new int[] { 1, 2, 3 });
        System.out.println(c.getSum());
    }
}
