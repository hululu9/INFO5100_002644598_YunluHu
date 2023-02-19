public class Dog {

    // properties
    String name;
    String breed;
    int age;
    String color;
    String gender;
    double height;
    double weight;
    boolean vaccinated;

    // print a statement in constructor
    public Dog(String name, String breed, int age, String color, String gender, double height, double weight, boolean vaccinated) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.height = height;
        ;
        this.weight = weight;
        this.vaccinated = vaccinated;

        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Vaccinated: " + vaccinated);

    }

    // methods
    public void barking() {
        System.out.println(name + " is barking");
    }

    public void hungry() {
        System.out.println(name + " is hungry");
    }

    public void sleeping() {
        System.out.println(name + " is sleeping");
    }


    // a Main method to instantiate 3 objects
    public static void main(String[] args) {
        Dog dog1 = new Dog("Charlie", "Golden Retriever", 5, "Golden", "Male", 50, 30, true);
        dog1.barking();
        System.out.println("====================");

        Dog dog2 = new Dog("Lucy", "Maltese", 3, "White", "Female", 30, 15, true);
        dog2.hungry();
        System.out.println("====================");

        Dog dog3 = new Dog("Michael", "Husky", 4, "Black", "Male", 50, 25, false);
        dog3.sleeping();
    }

}

