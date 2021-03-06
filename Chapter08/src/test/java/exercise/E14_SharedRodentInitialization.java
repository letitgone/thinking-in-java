package exercise;

class NonSharedMember {
    public NonSharedMember(String id) {
        System.out.println("Non shared member constructor " + id);
    }
}


class SharedMember {
    private int refcount;

    public void addRef() {
        System.out.println("Number of references " + ++refcount);
    }

    protected void dispose() {
        if (--refcount == 0)
            System.out.println("Disposing " + this);
    }

    public SharedMember() {
        System.out.println("exercise.Shared member constructor");
    }

    public String toString() {
        return "exercise.Shared member";
    }
}


class Rodent3 {
    private SharedMember m;
    NonSharedMember m1 = new NonSharedMember("r1"), m2 = new NonSharedMember("r2");

    public Rodent3(SharedMember sm) {
        System.out.println("exercise.Rodent constructor");
        m = sm;
        m.addRef();
    }

    public void hop() {
        System.out.println("exercise.Rodent hopping");
    }

    public void scurry() {
        System.out.println("exercise.Rodent scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Rodents");
    }

    protected void dispose() {
        System.out.println("Disposing " + this);
        m.dispose();
    }

    public String toString() {
        return "exercise.Rodent";
    }
}


class Mouse3 extends Rodent3 {
    NonSharedMember m1 = new NonSharedMember("m1"), m2 = new NonSharedMember("m2");

    public Mouse3(SharedMember sm) {
        super(sm);
        System.out.println("exercise.Mouse constructor");
    }

    public void hop() {
        System.out.println("exercise.Mouse hopping");
    }

    public void scurry() {
        System.out.println("exercise.Mouse scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Mice");
    }

    public String toString() {
        return "exercise.Mouse";
    }
}


class Gerbil3 extends Rodent3 {
    private SharedMember m;
    NonSharedMember m1 = new NonSharedMember("g1"), m2 = new NonSharedMember("g2");

    public Gerbil3(SharedMember sm) {
        super(sm);
        System.out.println("exercise.Gerbil constructor");
    }

    public void hop() {
        System.out.println("exercise.Gerbil hopping");
    }

    public void scurry() {
        System.out.println("exercise.Gerbil scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Gerbils");
    }

    public String toString() {
        return "exercise.Gerbil";
    }
}


class Hamster3 extends Rodent3 {
    private SharedMember m;
    NonSharedMember m1 = new NonSharedMember("h1"), m2 = new NonSharedMember("h2");

    public Hamster3(SharedMember sm) {
        super(sm);
        System.out.println("exercise.Hamster constructor");
    }

    public void hop() {
        System.out.println("exercise.Hamster hopping");
    }

    public void scurry() {
        System.out.println("exercise.Hamster scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Hamsters");
    }

    public String toString() {
        return "exercise.Hamster";
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/12
 */
public class E14_SharedRodentInitialization {
    public static void main(String args[]) {
        SharedMember sm = new SharedMember();
        Rodent3[] rodents = {new Hamster3(sm), new Gerbil3(sm), new Mouse3(sm),};
        for (Rodent3 r : rodents)
            r.dispose();
    }
}
