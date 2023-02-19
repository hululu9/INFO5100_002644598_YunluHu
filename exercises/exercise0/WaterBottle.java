public class WaterBottle {

    // properties
    String productionBatch;
    String brand;
    double price;
    double volume;
    String material;
    String color;
    boolean isDishwasherSafe;
    boolean isLeakProof;

    // print a statement in constructor
    public WaterBottle(String productionBatch, String brand, double price, double volume, String material, String color, boolean isDishwasherSafe, boolean isLeakProof) {
        this.productionBatch = productionBatch;
        this.brand = brand;
        this.price = price;
        this.volume = volume;
        this.material = material;
        this.color = color;
        this.isDishwasherSafe = isDishwasherSafe;
        this.isLeakProof = isLeakProof;

        System.out.println("Water bottle information: \nProduction Batch: " + productionBatch + "\nBrand: " + brand + "\nPrice: " + price + "\nVolume: " + volume + "\nMaterial: " + material + "\nColor: " + color + "\nDishwasher Safe: " + isDishwasherSafe + "\nLeak Proof: " + isLeakProof);
    }

    // methods
    public void fillUp() {
        System.out.println("Filling up the bottle" + productionBatch);
    }

    public void drink() {
        System.out.println("Drinking water in the bottle" + productionBatch);
    }

    public void empty() {
        System.out.println("Emptying the bottle" + productionBatch);
    }

    // a Main method to instantiate 3 objects
    public static void main(String[] args) {
        WaterBottle bottle1 = new WaterBottle("XYZ3940", "Hydro Flask Inc.", 20, 500, "Stainless steel", "Black", true, true);
        bottle1.fillUp();
        System.out.println("====================");

        WaterBottle bottle2 = new WaterBottle("ABC5860", "Thermo Fisher Scientific", 29, 800, "Glass", "Clear", true, false);
        bottle2.drink();
        System.out.println("====================");

        WaterBottle bottle3 = new WaterBottle("TYV0382", "CamelBak Products LLC", 15, 400, "Plastic", "Blue", true, true);
        bottle3.empty();
    }

}
