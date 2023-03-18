import java.io.*;

public class SerializeTest {
    public static void main(String[] args) {
        // objects created in execise #2
        Triangle t1 = new Triangle(3, 4, 5);
        Rectangle r1 = new Rectangle(4, 3);
        Circle c1 = new Circle(1);
        Square s1 = new Square(2);

        try {
            //save objects in a file
            FileOutputStream fileOut = new FileOutputStream("shape.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            //write object(serialize) into the file
            out.writeObject(t1);
            out.writeObject(r1);
            out.writeObject(c1);
            out.writeObject(s1);

            //close streams
            out.close();
            fileOut.close();

            System.out.printf("Serialized data is saved in shape.ser");
        }catch (IOException i) {
            i.printStackTrace(); //handle exceptions
        }
    }
}
