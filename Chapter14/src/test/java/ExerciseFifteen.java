/**
 * @Author ZhangGJ
 * @Date 2019/07/16
 *//*

package typeinfo.pets2;
public class Cymric extends Manx {
    public static class Factory
        implements typeinfo.factory.Factory<Cymric> {
        public Cymric create() { return new Cymric(); }
    }
} ///:~
//: typeinfo/pets2/EgyptianMau.java
         package typeinfo.pets2;
             import typeinfo.pets.Cat;
             306
             Thinking in Java, 4th Edition Annotated Solution Guide
public class EgyptianMau extends Cat {
    public static class Factory
        implements typeinfo.factory.Factory<EgyptianMau> {
        public EgyptianMau create() {
            return new EgyptianMau();
        } }
} ///:~
//: typeinfo/pets2/Hamster.java
package typeinfo.pets2;
    import typeinfo.pets.Rodent;
public class Hamster extends Rodent {
    public static class Factory
        implements typeinfo.factory.Factory<Hamster> {
        public Hamster create() { return new Hamster(); }
    }
} ///:~
//: typeinfo/pets2/Manx.java
package typeinfo.pets2;
    import typeinfo.pets.Cat;
public class Manx extends Cat {
    public static class Factory
        implements typeinfo.factory.Factory<Manx> {
        public Manx create() { return new Manx(); }
    }
} ///:~
//: typeinfo/pets2/Mouse.java
package typeinfo.pets2;
    import typeinfo.pets.Rodent;
public class Mouse extends Rodent {
    public static class Factory
        implements typeinfo.factory.Factory<Mouse> {
        public Mouse create() { return new Mouse(); }
    }
} ///:~
//: typeinfo/pets2/Mutt.java
package typeinfo.pets2;
    import typeinfo.pets.Dog;
public class Mutt extends Dog {
    Type Information 307

    public static class Factory
        implements typeinfo.factory.Factory<Mutt> {
        public Mutt create() { return new Mutt(); }
    }
} ///:~
//: typeinfo/pets2/Pug.java
package typeinfo.pets2;
    import typeinfo.pets.Dog;
public class Pug extends Dog {
    public static class Factory
        implements typeinfo.factory.Factory<Pug> {
        public Pug create() { return new Pug(); }
    }
} ///:~
//: typeinfo/pets2/Rat.java
package typeinfo.pets2;
    import typeinfo.pets.Rodent;
public class Rat extends Rodent {
    public static class Factory
        implements typeinfo.factory.Factory<Rat> {
        public Rat create() { return new Rat(); }
    }
} ///:~
//: typeinfo/pets2/Pets.java
// Facade to produce a default PetCreator.
package typeinfo.pets2;
    import java.util.*;
    import typeinfo.factory.Factory;
    import typeinfo.pets.PetCreator;
    import typeinfo.pets.Pet;
@SuppressWarnings("unchecked")
public class Pets {
    private static class RFPetCreator extends PetCreator {
        static List<Factory<? extends Pet>> petFactories =
            Arrays.asList(new Mutt.Factory(), new Pug.Factory(),
                new EgyptianMau.Factory(), new Manx.Factory(),
                new Cymric.Factory(), new Rat.Factory(),
                new Mouse.Factory(), new Hamster.Factory());
        @Override public List<Class<? extends Pet>> types() {
            return null;  // Dummy value, this method is not used!
        }
        @Override public Pet randomPet() { // Make 1 random Pet
            308
            Thinking in Java, 4th Edition Annotated Solution Guide

            int n = rand.nextInt(petFactories.size());
            return petFactories.get(n).create();
        }
    }
    private static Random rand = new Random(47);
    public static final PetCreator creator =
        new RFPetCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}*/
