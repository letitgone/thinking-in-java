package section_04;

class Grain {
    @Override
    public String toString() {
        return "Grain";
    }
}


class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat";
    }
}


class Mill {
    Grain process() {
        return new Grain();
    }
}


class WheatMill extends Mill {
    @Override
    Wheat process() {
        return new Wheat();
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/15
 */
public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }
}
