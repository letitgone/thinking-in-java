package section_09;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author ZhangGJ
 * @Date 2019/10/02
 */
public class IndividualTest {
    public static void main(String[] args) {
        Set<Individual> pets = new TreeSet<Individual>();
        //        for (List<? extends Pet> lp : MapOfList.petPeople.values())
        //            for (Pet p : lp)
        //                pets.add(p);
        System.out.println(pets);
    }
}
