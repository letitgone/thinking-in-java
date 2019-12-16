package section_03;

/**
 * @Author ZhangGJ
 * @Date 2019/10/06
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public static int nextSerialNumber() {
        return serialNumber++; // Not thread-safe
    }
}
