import java.io.*;

public class DeserializeTest {
    public static void main(String[] args) {
        Triangle t1 = null;
        Rectangle r1 = null;
        Circle c1 = null;
        Square s1 = null;

        try {
            //read from the file
            FileInputStream fileIn = new FileInputStream("Shape.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            //read objects(deserialize) from the file
            t1 = (Triangle)in.readObject();
            r1 = (Rectangle) in.readObject();
            c1 = (Circle)in.readObject();
            s1 = (Square)in.readObject();

            //close streams
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Triangle class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Triangle");
        System.out.println("Triangle: SideA=" + t1.getSideA() + " SideB=" + t1.getSideB()+ " SideC=" + t1.getSideC());
        System.out.println("Rectangle: Length=" + r1.getLength() + " Width=" + r1.getLength());
        System.out.println("Circle: Radius=" + c1.getRadius());
        System.out.println("Square: side=" + s1.getSide());
    }
}
