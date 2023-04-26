//Down casting
 class World {
    String name;
    void process() {
        System.out.println("Earth can Rotate !");
    }
}
class Earth extends World {
    int area;
    void process() {
        System.out.println("Earth is a World!");
    }
}
class TestCasting {
    public static void main(String[] args) {
        World W = new Earth();
        W.name = "Earth";
        System.out.println(W.name);
        W.process();
        Earth e = (Earth) W;
        e.area = 510;
        System.out.println(e.name);
        System.out.println(e.area);
        e.process();

    }
}

