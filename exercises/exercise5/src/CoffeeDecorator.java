// Decorator Pattern -- to customize the coffee
// Decorator abstract class
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }


    public String getType(){
        return decoratedCoffee.getType();
    }

    public double getCost(){
        return decoratedCoffee.getCost();
    };
}

// Concrete decorator
class Syrup extends CoffeeDecorator {
    public Syrup(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getType() {
        return decoratedCoffee.getType() + ", syrup";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}

class WhippedCream extends CoffeeDecorator {
    public WhippedCream(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getType() {
        return decoratedCoffee.getType() + ", whipped cream";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 1.0;
    }
}
