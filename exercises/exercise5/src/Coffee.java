// create an interface for the Coffee objects
interface Coffee {
    String getType();
    double getCost();
}

// create concrete implementations of the Coffee interface
class Espresso implements Coffee {
    public String getType() {
        return "Espresso";
    }

    public double getCost() {
        return 3.75;
    }
}

class Americano implements Coffee {
    public String getType() {
        return "Americano";
    }

    public double getCost(){
        return 4.25;
    }
}

class Macchiato implements Coffee{
    public String getType() {
        return "Macchiato";
    }

    public double getCost() {
        return 4.00;
    }
}

class Cappuccino implements Coffee{
    public String getType() {
        return "Cappuccino";
    }

    public double getCost() {
        return 4.75;
    }
}

class Latte implements Coffee{
    public String getType() {
        return "Latte";
    }

    public double getCost() {
        return 5.25;
    }
}




