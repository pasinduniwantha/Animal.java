//up casting
public class Animal {
        String name;
        void setName() {
            System.out.println("Elephant");
        }
}
class Fish extends Animal {
    String color;
    void setName() {
        System.out.println("Blue Fish ");
    }
}
class Run {
    public static void main(String[] args) {
         Animal a = new Fish();
         a.name = "Alaguduwa";
         Fish f = new Fish();
         f.name = "Linna";
         f.color = "grey";
        System.out.println("sub class object");
        System.out.println("Name - " + a.name);
        a.setName();
        System.out.println("super class object");
        System.out.println("Name - " + f.color);
        System.out.println("Name - " + f.name ) ;
    }

}