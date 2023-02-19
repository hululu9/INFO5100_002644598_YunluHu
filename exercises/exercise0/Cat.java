public class Cat {
    // properties
    String name;
    String breed;
    int age;
    String coatColor;
    String gender;
    String eyeColor;
    double weight;
    boolean vaccinated;

    // print a statement in constructor
    public Cat(String name, String breed, int age, String coatColor, String gender, String eyeColor, double weight, boolean vaccinated) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.coatColor = coatColor;
        this.gender = gender;
        this.eyeColor = eyeColor;;
        this.weight = weight;
        this.vaccinated = vaccinated;

        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Coat color: " + coatColor);
        System.out.println("Gender: " + gender);
        System.out.println("Eye color: " + eyeColor);
        System.out.println("Weight: " + weight);
        System.out.println("Vaccinated: " + vaccinated);

    }

    // methods
    public void eating(){
        System.out.println(name + " is eating");
    }

    public void hungry(){
        System.out.println(name + " is hungry");
    }

    public void sleeping(){
        System.out.println(name + " is sleeping");
    }

    // a Main method to instantiate 3 objects
    public static void main(String []args) {
        Cat cat1 = new Cat("Marvella", "British Shorthair", 1, "Blue golden shaded", "Female", "Green", 7, true);
        cat1.eating();
        System.out.println("====================");

        Cat cat2 = new Cat("Rocky", "American Shorthair", 5, "Tabby", "Male", "Green", 18, true);
        cat2.hungry();
        System.out.println("====================");

        Cat cat3 = new Cat("Zoe", "Siamese", 3, "Seal point", "Male", "Blue", 14, false);
        cat3.sleeping();
    }

}
