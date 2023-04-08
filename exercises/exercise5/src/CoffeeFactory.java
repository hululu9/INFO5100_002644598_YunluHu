// Factory Pattern
// to create different types of coffee products
public class CoffeeFactory {
    public Coffee getCoffee(String coffeeType){
        if(coffeeType == null){
            return null;
        }
        if(coffeeType.equalsIgnoreCase("ESPRESSO")){
            return new Espresso();
        } else if (coffeeType.equalsIgnoreCase("MACCHIATO")) {
            return new Macchiato();
        } else if (coffeeType.equalsIgnoreCase("AMERICANO")) {
            return new Americano();
        } else if (coffeeType.equalsIgnoreCase("CAPPUCCINO")) {
            return new Cappuccino();
        } else if (coffeeType.equalsIgnoreCase("LATTE")) {
            return new Latte();
        }
        return null;
    }
}

