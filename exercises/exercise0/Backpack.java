public class Backpack {

    // properties
    String productionBatch;
    String brand;
    double price;
    double capacity;
    String material;
    String color;
    int numOfCompartments;
    boolean isWaterResistant;

    // print a statement in constructor
    public Backpack(String productionBatch, String brand, double price, double capacity, String material, String color, int numOfCompartments, boolean isWaterResistant) {
        this.productionBatch = productionBatch;
        this.brand = brand;
        this.price = price;
        this.capacity = capacity;
        this.material = material;
        this.color = color;
        this.numOfCompartments = numOfCompartments;
        this.isWaterResistant = isWaterResistant;

        System.out.println("Water bottle information: \nProduction Batch: " + productionBatch + "\nBrand: " + brand + "\nPrice: " + price + "\nCapacity: " + capacity + "\nMaterial: " + material + "\nColor: " + color + "\nNumber of compartments: " + numOfCompartments + "\nWater Resistant: " + isWaterResistant);
    }

    // methods
    public void open() {
        System.out.println("Opening bag" + productionBatch);
    }

    public void close() {
        System.out.println("Closing bag" + productionBatch);
    }

    public void carry() {
        System.out.println("Carrying bag" + productionBatch);
    }

    // a Main method to instantiate 3 objects
    public static void main(String[] args) {
        Backpack backpack1 = new Backpack("2897502", "Nike", 56, 30, "Canvas", "White", 3, false);
        backpack1.open();
        System.out.println("====================");

        Backpack backpack2 = new Backpack("2390750", "Adidas", 48, 35, "Nylon", "Black", 2, true);
        backpack2.close();
        System.out.println("====================");

        Backpack backpack3 = new Backpack("4870273", "The north face", 60, 40, "Polyester", "Grey", 4, true);
        backpack3.carry();
    }
}
