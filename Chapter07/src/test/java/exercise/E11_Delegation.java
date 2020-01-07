package exercise;

import section_02.Cleanser;

class DetergentDelegation {
    private Cleanser cleanser = new Cleanser();

    // Delegated methods:
    public void append(String a) {
        cleanser.append(a);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public String toString() {
        return cleanser.toString();
    }

    public void scrub() {
        append(" exercise.DetergentDelegation.scrub()");
        cleanser.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {
        DetergentDelegation x = new DetergentDelegation();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
public class E11_Delegation {
    public static void main(String[] args) {
        DetergentDelegation.main(args);
    }
}
