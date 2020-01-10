package exercise;

class Shared {
    private int refcount = 0;
    private static int counter = 0;
    private int id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0)
            System.out.println("Disposing " + this);
    }

    protected void finalize() {
        if (refcount != 0)
            System.out.println("Error: object is not properly cleaned-up!");
    }

    public String toString() {
        return "exercise.Shared " + id;
    }
}


class Composing {
    private Shared shared;
    private static int counter = 0;
    private int id = counter++;

    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    public String toString() {
        return "exercise.Composing " + id;
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/12
 */
public class E13_VerifiedRefCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing =
            {new Composing(shared), new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)};
        for (Composing c : composing)
            c.dispose();
        System.gc();
        // Verify failure:
        new Composing(new Shared());
        System.gc();
    }
}
