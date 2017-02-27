package Глава_14.упражнение_3;

/**
 * Created by andrej on 16.02.17.
 */
abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape rhomboid = new Circle();

        if (rhomboid instanceof Circle){
            Circle c = (Circle) rhomboid;
            System.out.println(c);
        }
        if (rhomboid instanceof Rhomboid){
        Rhomboid r = (Rhomboid) rhomboid;
            System.out.println(r);
        }
    }
}
