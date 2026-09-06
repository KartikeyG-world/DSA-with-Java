package AbstractDesign;


interface Bird{
     default void fly(){}
     default void eat(){}
}

class Sparrow implements Bird{


    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }
}
class Crow implements Bird{
    public void fly() {
        System.out.println("Crow flying");
    }
    @Override
    public void eat() {
        System.out.println("Crow eating");
    }
}
public class Main {
    public static void doBirdStuff(Bird b){
        b.fly();
        b.eat();
    }
    static void main() {
//        Bird b = new Sparrow();
//        b.fly();
//        b.eat();
//        b =  new Crow();
//        b.fly();
//        b.eat();
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}
