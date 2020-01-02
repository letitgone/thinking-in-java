/**
 * 静态方法调用非静态方法
 * @Author ZhangGJ
 * @Date 2020/01/02 07:29
 */

class NonStaticMethod{
    public String test(){
        return "123";
    }
}
public class StaticCallNonStatic {

    public static void s1(NonStaticMethod nonStaticMethod){
        System.out.println(nonStaticMethod.test());
    }

    public static void main(String[] args) {
        s1(new NonStaticMethod());
    }
}
