/**
 * @Author ZhangGJ
 * @Date 2019/09/04
 */
interface Payable {
}


class Employee1 implements Payable {
}


class Hourly extends Employee1 implements Payable {
}


public class E31_MultipleInterfaceVariants2 {
    public static void main(String[] args) {
        new Employee();
        new Hourly();
    }
}
