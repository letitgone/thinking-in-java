package section_09;

import net.mindview.util.CountingGenerator;
import net.mindview.util.MapData;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
public class SynchronizedHashMapTest extends MapTest {
    Map<Integer, Integer> containerInitializer() {
        return Collections.synchronizedMap(new HashMap<Integer, Integer>(
                MapData.map(new CountingGenerator.Integer(), new CountingGenerator.Integer(),
                        containerSize)));
    }

    SynchronizedHashMapTest(int nReaders, int nWriters) {
        super("Synched HashMap", nReaders, nWriters);
    }
}
