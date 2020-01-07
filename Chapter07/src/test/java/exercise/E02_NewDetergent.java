package exercise;

import section_02.Detergent;

class NewDetergent extends Detergent {
    @Override
    public void scrub() {
        append(" exercise.NewDetergent.scrub()");
        super.scrub(); // Doesn't have to be first
    }

    public void sterilize() {
        append(" sterilize()");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
public class E02_NewDetergent {
    public static void main(String args[]) {
        NewDetergent nd = new NewDetergent();
        nd.dilute();
        nd.scrub();
        nd.sterilize();
        System.out.println(nd);
    }
}
