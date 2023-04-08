// customized order
public class CoffeeOrder {
    public static void main(String[] args) {
        Coffee coffee1 = new Espresso();
        System.out.println("Order: " +coffee1.getType()+"\nCost: " + coffee1.getCost());

        Coffee coffee2 = new WhippedCream(new Latte());
        System.out.println("Order: " +coffee2.getType()+"\nCost: " + coffee2.getCost());

        Coffee coffee3 = new Syrup(new Americano());
        System.out.println("Order: " +coffee3.getType()+"\nCost: " + coffee3.getCost());
    }
}
