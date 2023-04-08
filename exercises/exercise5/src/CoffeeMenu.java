// coffee products menu
public class CoffeeMenu {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        Coffee espresso = coffeeFactory.getCoffee("ESPRESSO");
        Coffee macchiato = coffeeFactory.getCoffee("MACCHIATO");
        Coffee cappuccino = coffeeFactory.getCoffee("CAPPUCCINO");
        Coffee latte = coffeeFactory.getCoffee("LATTE");
        Coffee americano = coffeeFactory.getCoffee("AMERICANO");

        System.out.println("Coffee Menu");
        System.out.println("-------------------");
        System.out.println(espresso.getType()+ "\t" +espresso.getCost());
        System.out.println(macchiato.getType() + "\t" + macchiato.getCost());
        System.out.println(cappuccino.getType() + "\t" + cappuccino.getCost());
        System.out.println(latte.getType() + "\t\t" + latte.getCost());
        System.out.println(americano.getType() + "\t" + americano.getCost());
    }
}
