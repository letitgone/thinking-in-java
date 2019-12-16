/**
 * @Author ZhangGJ
 * @Date 2019/12/09
 */
public class Test {
    public Boolean test(ITest iTest){
        return iTest.open();
//        ITest iTest = new ITest() {
//            @Override
//            public Boolean open() {
//                return null;
//            }
//        };
//        return true;
    }
}
