// Observer Pattern
// to notify customers of events happening in the coffee shop

public class CoffeeShopApp {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();

        Customer customer1 = new Customer("Vivian");
        Customer customer2 = new Customer("Kevin");
        Customer customer3 = new Customer("Sharon");

        coffeeShop.registerObserver(customer1);
        coffeeShop.registerObserver(customer2);
        coffeeShop.registerObserver(customer3);

        coffeeShop.setMessage("Seasonal Menu: Ube Latte");
        coffeeShop.setMessage("Special offer: Buy 1 get 1 free on all coffees!");
    }
}
