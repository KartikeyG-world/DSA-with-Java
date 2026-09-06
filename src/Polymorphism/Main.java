package Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println(c.add(2,4));
//        System.out.println(c.add(2,4,5));
//        System.out.println(c.add(2,4,5,6));
//        Circle c = new Circle();
//        doDrwaingStuff(c);
//        Rect r = new Rect();
//        doDrwaingStuff(r);
//        Shape s = new Shape();
//        doDrwaingStuff(s);

        Circle c = new Circle();
        doDrawingStuff(c);
    }


    public static void doDrawingStuff(Shape s) {
        s.draw();
        Circle c = (Circle)s;
        c.draw();
    }
}
