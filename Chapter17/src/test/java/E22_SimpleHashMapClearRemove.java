import net.mindview.util.Countries;
import section_09.MapEntry;
import section_09.SimpleHashMap;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author ZhangGJ
 * @Date 2019/10/02
 */
class SimpleHashMap3<K, V> extends SimpleHashMap<K, V> {
    @SuppressWarnings("unchecked")
    public void clear() {
        // Effectively erase everything by allocating
        // a new empty array of buckets:
        buckets = new LinkedList[SIZE];
    }

    public V remove(Object key) {
        // Code is copied from get(), except that
        // before returning the value, the Map.Entry is
        // removed from the list:
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null)
            return null;
        Iterator<MapEntry<K, V>> it = buckets[index].iterator();
        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                // Changes are here:
                V value = iPair.getValue();
                // Removes the last fetched value:
                it.remove();
                return value;
            }
        }
        return null;
    }
}


public class E22_SimpleHashMapClearRemove {
    public static void main(String[] args) {
        SimpleHashMap3<String, String> m = new SimpleHashMap3<String, String>();
        m.putAll(Countries.capitals(10));
        System.out.println(m);
        System.out.println("m.get(\"BURUNDI\") = " + m.get("BURUNDI"));
        m.remove("BURUNDI");
        System.out.println("After removal, m.get(\"BURUNDI\") = " + m.get("BURUNDI"));
        m.clear();
        System.out.println("After clearing: " + m);
    }
}
