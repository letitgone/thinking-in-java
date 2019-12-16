import section_12.Blip3;

import java.io.*;

import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
class Blip3B extends Blip3 {
    public Blip3B() {
    }

    public Blip3B(String x, int a) {
        super(x, a);
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        print("Blip3B.writeExternal");
        // You must do this:
        //    out.writeObject(s);
        //    out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        print("Blip3B.readExternal");
        // You must do this:
//        s = (String) in.readObject();
//        i = in.readInt();
    }
}


public class E29_Blip3Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        print("Constructing objects:");
        Blip3B b3 = new Blip3B("A String ", 47);
        print(b3);
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Blip3B.out"));
        print("Saving object:");
        o.writeObject(b3);
        o.close();
        // Now get it back:
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Blip3B.out"));
        print("Recovering b3:");
        b3 = (Blip3B) in.readObject();
        print(b3);
    }
}
