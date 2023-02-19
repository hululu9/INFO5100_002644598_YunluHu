public class Desk {

    // properties
    String productionBatch;
    String brand;
    double price;
    String material;
    String color;
    double height;
    double width;
    double length;

    // print a statement in constructor
    public Desk (String productionBatch, String brand, double price, String material, String color, double height, double width, double length) {
        this.productionBatch = productionBatch;
        this.brand = brand;
        this.price = price;
        this.material = material;
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;

        System.out.println("Desk information: \nProduction Batch: " + productionBatch + "\nBrand: " + brand + "\nPrice: " + price + "\nMaterial: " + material + "\nColor: " + color + "\nHeight: " + height + "\nWidth: " + width + "\nLength: " + length);
    }

    // methods
    public void knock(){
        System.out.println("Knock desk" + productionBatch);
    }

    public void move(){
        System.out.println("Move desk" + productionBatch);
    }

    public void slam(){
        System.out.println("Slam desk" + productionBatch);
    }

    // a Main method to instantiate 3 objects
    public static void main (String[]args){
        Desk desk1 = new Desk("SUN1234", "Ikea", 80, "Plastic", "White", 100, 60, 150);
        desk1.knock();
        System.out.println("====================");

        Desk desk2 = new Desk("CHY2484", "Herman Miller", 240, "Metal", "Sliver", 120, 100, 100);
        desk2.move();
        System.out.println("====================");

        Desk desk3 = new Desk("VIR3495", "Branch", 300, "Wood", "Brown", 100, 80, 120);
        desk3.slam();
    }

}


