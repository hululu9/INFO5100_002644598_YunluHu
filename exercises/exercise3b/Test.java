public class Test {
    public static void main(String[] args) {
        Triangle.name = "Triangle"; // static field to set name of all the instance in class of Triangle
        Triangle t1 = new Triangle(3, 4, 5);
        Shape shape1 = new Triangle(6, 8, 10); // polymorphism
        System.out.println("Shape name: " + t1.getName());
        System.out.println("Perimeter: " + t1.calculatePerimeter() + "\nArea: " + t1.calculateArea());
        System.out.println("Perimeter: " + shape1.calculatePerimeter() + "\nArea: " + shape1.calculateArea());

        Rectangle.name  = "Rectangle";
        Rectangle r1 = new Rectangle(4, 3);
        Shape shape2 = new Rectangle(8, 6);
        System.out.println("Shape name: " + r1.getName());
        System.out.println("Perimeter: " + r1.calculatePerimeter() + "\nArea: " + r1.calculateArea());
        System.out.println("Perimeter: " + shape2.calculatePerimeter() + "\nArea: " + shape2.calculateArea());

        Circle.name = "Circle";
        Circle c1 = new Circle(1);
        Shape shape3 = new Circle(2);
        System.out.println("Shape name: " + c1.getName());
        System.out.println("Perimeter: " + c1.calculatePerimeter() + "\nArea: " + r1.calculateArea());
        System.out.println("Perimeter: " + shape3.calculatePerimeter() + "\nArea: " + shape3.calculateArea());


        Square.name = "Square";
        Square s1 = new Square(2);
        Shape shape4 = new Square(4);
        System.out.println("Shape name: " + s1.getName());
        System.out.println("Perimeter: " + s1.calculatePerimeter() + "\nArea: " + s1.calculateArea());
        System.out.println("Perimeter: " + shape4.calculatePerimeter() + "\nArea: " + shape4.calculateArea());
    }
}
