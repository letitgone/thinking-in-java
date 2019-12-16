package section_06;

import net.mindview.util.*;

import java.util.ArrayList;

/**
 * @Author ZhangGJ
 * @Date 2019/07/29
 */
class Amphibian {
}


class Vehicle {
}

class TupleTest2{
    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(), new Amphibian(), "hi", 47);
    }
}
public class TupleList<A,B,C,D>
    extends ArrayList<FourTuple<A,B,C,D>> {
    public static void main(String[] args) {
        TupleList<Vehicle, Amphibian, String, Integer> tl = new TupleList<Vehicle, Amphibian, String, Integer>();
        tl.add(TupleTest2.h());
        tl.add(TupleTest2.h());
        for(FourTuple<Vehicle,Amphibian,String,Integer> i: tl)
            System.out.println(i);
    }
}
