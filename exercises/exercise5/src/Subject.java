import java.util.ArrayList;
import java.util.List;

// Subject Interface
interface Subject {
    void registerObserver(Observer observer);
    void notifyObservers();
}

// Concrete subject -- coffee shop
class CoffeeShop implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private String message;

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // set new messages to sent to customers
    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}

