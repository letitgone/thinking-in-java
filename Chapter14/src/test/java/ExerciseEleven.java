/**
 * @Author ZhangGJ
 * @Date 2019/07/10
 */
public class ExerciseEleven {
    //    public class Gerbil extends typeinfo.pets.Rodent {
    //        public Gerbil(String name) { super(name); }
    //        public Gerbil() {}
    //    } ///:~
    //    //: typeinfo/pets1/ForNameCreator.java
    //package typeinfo.pets1;
    //import java.util.*;
    //import typeinfo.pets.*;
    //    @SuppressWarnings("unchecked")
    //    public class ForNameCreator extends PetCreator {
    //        private static List<Class<? extends Pet>> types =
    //            new ArrayList<Class<? extends Pet>>();
    //        // Types that you want to be randomly created:
    //        private static String[] typeNames = {
    //            "typeinfo.pets.Mutt",
    //            "typeinfo.pets.Pug",
    //            "typeinfo.pets.EgyptianMau",
    //            "typeinfo.pets.Manx",
    //            "typeinfo.pets.Cymric",
    //            "typeinfo.pets.Rat",
    //            "typeinfo.pets.Mouse",
    //            "typeinfo.pets.Hamster",
    //            "typeinfo.pets1.Gerbil"
    //        }; static {
    //            try {
    //                for(String name : typeNames)
    //                    types.add(
    //                        (Class<? extends Pet>)Class.forName(name));
    //            } catch(ClassNotFoundException e) {
    //                throw new RuntimeException(e);
    //            } }
    //        public List<Class<? extends Pet>> types() {return types;}
    //    } ///:~
    //    //: typeinfo/pets1/LiteralPetCreator1.java
    //    // Using class literals.
    //package typeinfo.pets1;
    //import java.util.*;
    //import typeinfo.pets.*;
    //    @SuppressWarnings("unchecked")
    //                                              300
    //    Thinking in Java, 4th Edition Annotated Solution Guide
    //    public class LiteralPetCreator1 extends PetCreator {
    //        // No try block needed.
    //        public static final List<Class<? extends Pet>> allTypes =
    //            Collections.unmodifiableList(Arrays.asList(
    //                Pet.class, Dog.class, Cat.class,  Rodent.class,
    //                Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
    //                Cymric.class, Rat.class, Mouse.class,Hamster.class,
    //                Gerbil.class));
    //        // Types for random creation:
    //        private static final List<Class<? extends Pet>> types =
    //            allTypes.subList(allTypes.indexOf(Mutt.class),
    //                allTypes.size());
    //        public List<Class<? extends Pet>> types() {
    //            return types;
    //        }
    //        public static void main(String[] args) {
    //            System.out.println(types);
    //        }
    //    } /* Output:
    //[class typeinfo.pets.Mutt, class typeinfo.pets.Pug, class
    //typeinfo.pets.EgyptianMau, class typeinfo.pets.Manx, class
    //typeinfo.pets.Cymric, class typeinfo.pets.Rat, class
    //typeinfo.pets.Mouse, class typeinfo.pets.Hamster, class
    //typeinfo.pets1.Gerbil]
    //*///:~
    //    //: typeinfo/PetCount.java
    //    // Using instanceof.
    //package typeinfo;
    //import java.util.*;
    //import static net.mindview.util.Print.*;
    //import typeinfo.pets.*;
    //import typeinfo.pets1.Gerbil;
    //import typeinfo.pets1.ForNameCreator;
    //    public class PetCount {
    //        static class PetCounter extends HashMap<String, Integer>{
    //            public void count(String type) {
    //                Integer quantity = get(type);
    //                if(quantity == null)
    //                    put(type, 1);
    //                else
    //                    put(type, quantity + 1);
    //            }
    //        }
    //        public static void
    //        countPets(PetCreator creator) {
    //            Type Information 301
    //
    //            PetCounter counter= new PetCounter();
    //            for(Pet pet : creator.createArray(20)) {
    //                // List each individual pet:
    //                printnb(pet.getClass().getSimpleName() + " ");
    //                if(pet instanceof Pet)
    //                    counter.count("Pet");
    //                if(pet instanceof Dog)
    //                    counter.count("Dog");
    //                if(pet instanceof Mutt)
    //                    counter.count("Mutt");
    //                if(pet instanceof Pug)
    //                    counter.count("Pug");
    //                if(pet instanceof Cat)
    //                    counter.count("Cat");
    //                if(pet instanceof Manx)
    //                    counter.count("EgyptianMau");
    //                if(pet instanceof Manx)
    //                    counter.count("Manx");
    //                if(pet instanceof Manx)
    //                    counter.count("Cymric");
    //                if(pet instanceof Rodent)
    //                    counter.count("Rodent");
    //                if(pet instanceof Rat)
    //                    counter.count("Rat");
    //                if(pet instanceof Mouse)
    //                    counter.count("Mouse");
    //                if(pet instanceof Hamster)
    //                    counter.count("Hamster");
    //                if(pet instanceof Gerbil)
    //                    counter.count("Gerbil");
    //            }
    //            // Show the counts:
    //            print();
    //            print(counter);
    //        }
    //        public static void main(String[] args) {
    //            countPets(new ForNameCreator());
    //        }
    //    }
}
