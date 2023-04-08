// Observer interface

interface Observer {
   public void update(String message);
}

// Concrete observer -- customers

class Customer implements Observer {
    private String userName;

    public Customer(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        System.out.println("Customer " + userName + " received message: " + message);
    }
}


