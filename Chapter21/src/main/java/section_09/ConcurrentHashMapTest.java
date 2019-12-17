package section_09;

import net.mindview.util.CountingGenerator;
import net.mindview.util.MapData;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
public class ConcurrentHashMapTest extends MapTest {
    Map<Integer, Integer> containerInitializer() {
        return new ConcurrentHashMap<Integer, Integer>(
                MapData.map(new CountingGenerator.Integer(), new CountingGenerator.Integer(),
                        containerSize));
    }

    ConcurrentHashMapTest(int nReaders, int nWriters) {
        super("ConcurrentHashMap", nReaders, nWriters);
    }
}
