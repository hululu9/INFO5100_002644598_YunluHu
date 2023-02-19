public class Tablet {

    // properties
    String name;
    String brand;
    String releasedYear;
    double price;
    String color;
    double screenSize;
    int storage;
    int batteryCapacity;

    // print a statement in constructor
    public Tablet(String name, String brand, String releasedYear, double price, String color, double screenSize, int storage, int batteryCapacity) {
        this.name = name;
        this.brand = brand;
        this.releasedYear = releasedYear;
        this.price = price;
        this.color = color;
        this.screenSize = screenSize;
        this.storage = storage;
        this.batteryCapacity = batteryCapacity;

        System.out.println("Tablet information:\nName: " + name + "\nBrand: " + brand + "\nReleased Year: " + releasedYear + "\nPrice: " + price + "\nColor: " + color + "\nScreen size: " + screenSize + "\nStorage: " + storage + "\nBattery Capacity：" + batteryCapacity);
    }

    // methods
    public void watchVideo() {
        System.out.println("Use phone " + name + " to watch videos");
    }

    public void listenMusic() {
        System.out.println("Use phone " + name + " to listen to music");
    }

    public void playGame() {
        System.out.println("Use phone " + name + " to play games");
    }

    // a Main method to instantiate 3 objects
    public static void main(String[] args) {
        Tablet tablet1 = new Tablet("iPad Pro", "Apple", "2022", 799, "Space Grey", 11, 128,7538);
        tablet1.watchVideo();
        System.out.println("====================");

        Tablet tablet2 = new Tablet("Galaxy Tab S8", "Samsung", "2022", 779.99, "Silver", 11, 256, 8000);
        tablet2.listenMusic();
        System.out.println("====================");

        Tablet tablet3 = new Tablet("Surface Go 3", "Microsoft", "2021", 469.99, "Platinum", 10.5, 128, 8000);
        tablet3.playGame();
    }

}
