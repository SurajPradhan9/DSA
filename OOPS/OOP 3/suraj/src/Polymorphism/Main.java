package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Triangle triangle=new Triangle();
        Square square =new Square();

        Shapes obj=new Square();

        obj.area();


    }
}
