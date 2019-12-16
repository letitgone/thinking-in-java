import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;
import section_03.ExtractInterface;
import section_03.InterfaceExtractorProcessor;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * @Author ZhangGJ
 * @Date 2019/10/04
 */
public class E02_InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory {
    public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> atds,
        AnnotationProcessorEnvironment env) {
        return new InterfaceExtractorProcessor(env);
    }

    public Collection<String> supportedAnnotationTypes() {
        return Collections.singleton("annotations.ExtractInterface");
    }

    public Collection<String> supportedOptions() {
        return Collections.emptySet();
    }
} ///:~


//: annotations/Divisor.java
@ExtractInterface("IDivisor")
class Divisor {
    public int divide(int x, int y) {
        int total = 0;
        while (x >= y) {
            x = sub(x, y);
            total++;
        }
        return total;
    }

    private int sub(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        System.out.println("2678/134 = " + new Divisor().divide(2678, 134));
    }
}
