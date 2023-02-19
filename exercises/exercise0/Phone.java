public class Phone {

    // properties
    String name;
    String brand;
    String model;
    double price;
    String color;
    double screenSize;
    int storage;
    String ram;

    // print a statement in constructor
    public Phone(String name, String brand, String model, double price, String color, double screenSize, int storage, String ram) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.screenSize = screenSize;
        this.storage = storage;
        this.ram = ram;

        System.out.println("Phone information:\nName: " + name + "\nBrand: " + brand + "\nModel: " + model + "\nPrice: " + price + "\nColor: " + color + "\nScreen size: " + screenSize + "\nStorage: " + storage + "\nRam：" + ram);
    }

    // method
    public void call() {
        System.out.println("Use phone " + name + " to make a call");
    }

    public void sendMessage() {
        System.out.println("Use phone " + name + " to send a message");
    }

    public void takePhoto() {
        System.out.println("Use phone " + name + " to take a photo");
    }

    // a Main method to instantiate 3 objects
    public static void main(String[] args) {
        Phone phone1 = new Phone("iPhone 14", "Apple", "A2649", 799, "Blue", 6.1, 128,"6GB");
        phone1.call();
        System.out.println("====================");

        Phone phone2 = new Phone("Galaxy S23 Ultra", "Samsung", "SM-S918", 1199.99, "Cream", 6.8, 256, "12GB");
        phone2.sendMessage();
        System.out.println("====================");

        Phone phone3 = new Phone("OnePlus 11", "OnePlus", "PBH110", 699, "Titan Black", 6.7, 256, "16GB");
        phone3.takePhoto();
    }

}
