public class Parent {
    String name;
    void display() {
        System.out.println("super class is Running! ");
    }
}
class Child extends Parent {
    int age;
    void display() {
        System.out.println("sub class is running");
    }
}
//casting kara atha
class Downcasting {
    public static void main(String[] args) {
        Parent p = new Child(); //upcasting
        p.name = "pasindu" ;
        Child c = (Child) p; //downcasting
        c.age = 20;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();
    }
}
