public class Chair {

    // properties
    String productionBatch;
    String brand;
    double price;
    String material;
    String color;
    double height;
    double weightCapacity;
    boolean swivel;

    // print a statement in constructor
    public Chair (String productionBatch, String brand, double price, String material, String color, double height, double weightCapacity, boolean swivel) {
        this.productionBatch = productionBatch;
        this.brand = brand;
        this.price = price;
        this.material = material;
        this.color = color;
        this.height = height;
        this.weightCapacity = weightCapacity;
        this.swivel = swivel;

        System.out.println("Chair information: \nProduction Batch: " + productionBatch + "\nBrand: " + brand + "\nPrice: " + price + "\nMaterial: " + material + "\nColor: " + color + "\nHeight: " + height + "\nWeight Capacity: " + weightCapacity + "\nSwivel: " + swivel);
    }

    // methods
    public void move(){
        System.out.println("Move the chair" + productionBatch);
    }

    public void sitting(){
        System.out.println("Sitting on the chair" + productionBatch);
    }

    public void revolving(){
        System.out.println("Revolving the chair" + productionBatch);
    }

    // a Main method to instantiate 3 objects
    public static void main (String[]args){
        Chair chair1 = new Chair("FURN49506", "Ikea", 30, "Plastic", "White", 50, 150, true);
        chair1.move();
        System.out.println("====================");

        Chair chair2 = new Chair("DOEN58493", "Herman Miller", 200, "PU", "Black", 60, 200, true);
        chair2.sitting();
        System.out.println("====================");

        Chair chair3 = new Chair("GIRO34958", "Branch", 150, "Wood", "Brown", 50, 200, false);
        chair3.revolving();
    }

}


