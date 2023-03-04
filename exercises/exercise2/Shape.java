//create a abstract base class Shape
abstract class Shape {
    public abstract double calculatePerimeter();
    public abstract double calculateArea();

}

//derived classes
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    public static String name; //a static field shared by all the instance of the class

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public static String getName() {
        return name;
    }

    //overriding: use methods in Shape to calculate perimeter and area specifically for Triangle
    @Override
    public double calculatePerimeter() {
        return getSideA() + getSideB() + getSideC();
    }

    @Override
    public double calculateArea() {
        double p = (getSideA() + getSideB() + getSideC()) / 2;
        return Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    public static String name;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public static String getName() {
        return name;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public double calculateArea() {
        return getLength() * getWidth();
    }
}

class Circle extends Shape {
    private double radius;
    public static String name;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public static String getName() {
        return name;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public double calculateArea() {
        return Math.PI * getRadius() * getRadius() ;
    }
}

class Square extends Shape {
    private double side;
    public static String name;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public static String getName() {
        return name;
    }

    @Override
    public double calculatePerimeter() {
        return getSide() * 4;
    }

    @Override
    public double calculateArea() {
        return getSide() * getSide();
    }
}


