import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * @Author ZhangGJ
 * @Date 2019/07/22
 */
class StoryCharacter {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}


class GoodGuy extends StoryCharacter {
    public String toString() {
        return super.toString() + " is a good guy";
    }
}


class BadGuy extends StoryCharacter {
    public String toString() {
        return super.toString() + " is a bad guy";
    }
}


class Morton extends BadGuy {
}


class Frank extends BadGuy {
}


class Harmonica extends GoodGuy {
}


class Cheyenne extends GoodGuy {
}


class CharacterGenerator implements Generator<StoryCharacter>, Iterable<StoryCharacter> {
    private Class<?>[] types = {Morton.class, Frank.class, Harmonica.class, Cheyenne.class};
    private static Random rand = new Random(47);

    public CharacterGenerator() {
    }

    private int size = 0;

    public CharacterGenerator(int sz) {
        size = sz;
    }

    public StoryCharacter next() {
        try {
            return (StoryCharacter) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CharacterIterator implements Iterator<StoryCharacter> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public StoryCharacter next() {
            count--;
            return CharacterGenerator.this.next();
        }

        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<StoryCharacter> iterator() {
        return new CharacterIterator();
    }
}


public class E08_CharacterGenerator {
    public static void main(String[] args) {
        CharacterGenerator gen = new CharacterGenerator();
        for (int i = 0; i < 7; i++)
            System.out.println(gen.next());
        for (StoryCharacter p : new CharacterGenerator(7))
            System.out.println(p);
    }
}
