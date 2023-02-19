public class Laptop {

    // properties of Laptop
    String name;
    String brand;
    String releasedYear;
    double price;
    String color;
    double screenSize;
    int storage;
    String ram;

    // print a statement in constructor
    public Laptop(String name, String brand, String releasedYear, double price, String color, double screenSize, int storage, String ram) {
        this.name = name;
        this.brand = brand;
        this.releasedYear = releasedYear;
        this.price = price;
        this.color = color;
        this.screenSize = screenSize;
        this.storage = storage;
        this.ram = ram;

        System.out.println("Laptop information:\nName: " + name + "\nBrand: " + brand + "\nReleased Year: " + releasedYear + "\nPrice: " + price + "\nColor: " + color + "\nScreen size: " + screenSize + "\nStorage: " + storage + "\nRam：" + ram);
    }

    // methods of Laptop
    public void coding() {
        System.out.println("Use " + name + " to write some codes");
    }

    public void powerOn() {
        System.out.println("Powering on" + name);
    }

    public void openApplication() {
        System.out.println("Use " + name + " to open a application");
    }

    // two nested classes
    // keyboard class
    public class Keyboard {

        //properties of Keyboard
        String name;
        String brand;
        String color;
        double price;
        boolean iswireless;
        boolean isBacklit;
        boolean hasNumpad;
        String layout;

        public Keyboard(String name, String brand, String color, double price, boolean iswireless, boolean isBacklit, boolean hasNumpad, String layout) {
            this.name = name;
            this.brand = brand;
            this.color = color;
            this.price = price;
            this.iswireless = iswireless;
            this.isBacklit = isBacklit;
            this.hasNumpad = hasNumpad;
            this.layout = layout;

            System.out.println("Keyboard information:\nname: " + name + "\nBrand: " + brand + "\nColor: " + color + "\nPrice: " + price + "\nWireless: " + iswireless + "\nBacklit: " + isBacklit + "\nNumpad: " + hasNumpad + "\nLayout: " + layout);
        }

        // methods of Keyboard
        public void type() {
            System.out.println("Typing on " + name);
        }

        public void adjustBacklight() {
            System.out.println("Adjusting " + name + " backlight");
        }

        public void delete() {
            System.out.println("Press delete on " + name);
        }
    }

    // Mouse class
    public class Mouse {

        //properties of Mouse
        String name;
        String brand;
        String color;
        double price;
        boolean iswireless;
        boolean isBacklit;
        boolean hasScrollWheel;
        int numOfButton;

        public Mouse(String name, String brand, String color, double price, boolean iswireless, boolean isBacklit, boolean hasScrollWheel, int numOfButton) {
            this.name = name;
            this.brand = brand;
            this.color = color;
            this.price = price;
            this.iswireless = iswireless;
            this.isBacklit = isBacklit;
            this.hasScrollWheel = hasScrollWheel;
            this.numOfButton = numOfButton;

            System.out.println("Mouse information:\nname: " + name + "\nBrand: " + brand + "\nColor: " + color + "\nPrice: " + price + "\nWireless: " + iswireless + "\nBacklit: " + isBacklit + "\nScroll Wheel: " + hasScrollWheel + "\nNumber of button: " + numOfButton);
        }

        public void leftClick() {
            System.out.println("Use " + name + " to do a left click");
        }

        public void rightClick() {
            System.out.println("Use " + name + " to do a right click");
        }

        public void scroll() {
            System.out.println("Use " + name + " to do a scroll");
        }
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Macbook Pro", "Apple", "2023", 1999, "Space Grey", 14, 512, "16GB");
        laptop1.coding();
        System.out.println("====================");

        Laptop laptop2 = new Laptop("ThinkPad X1 Carbon Gen 9", "Lenovo", "2021", 1078, "Black", 14, 512, "16GB");
        laptop2.powerOn();
        System.out.println("====================");

        Laptop laptop3 = new Laptop("HP ENVY", "HP", "2022", 769, "Silver", 17, 512, "16GB");
        laptop3.openApplication();
        System.out.println("==============================================");


        Laptop.Keyboard keyboard1 = laptop1.new Keyboard("Magic Keyboard", "Apple", "White", 99, true, false, false, "QWERTY");
        keyboard1.type();
        System.out.println("====================");

        Laptop.Keyboard keyboard2 = laptop2.new Keyboard("Razer Huntsman", "Razer", "White", 90, false, true, false, "QWERTY");
        keyboard2.adjustBacklight();
        System.out.println("====================");

        Laptop.Keyboard keyboard3 = laptop3.new Keyboard("Logitech K360", "Logitech", "Black", 22, true, false, true, "QWERTY");
        keyboard3.delete();
        System.out.println("==============================================");


        Laptop.Mouse mouse1 = laptop1.new Mouse("Magic Mouse", "Apple", "White", 79, true, false, false, 1);
        mouse1.leftClick();
        System.out.println("====================");

        Laptop.Mouse mouse2 = laptop2.new Mouse("Razer Basilisk V3 Pro", "Razer", "Black", 160, true, true, true, 11);
        mouse2.rightClick();
        System.out.println("====================");

        Laptop.Mouse mouse3 = laptop3.new Mouse("Logitech G705", "Logitech", "White", 79, true, true, true, 6);
        mouse3.scroll();
    }
}



