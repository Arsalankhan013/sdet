package class21super;

public class Animal {
    //these are fields
    String name;
    String color;
    String breed;
    int age;

    public Animal(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    void printInfo() {
        System.out.println("Name " + name + " color " + color + " Breed " + breed + " age " + age);
    }
}
    class Dog extends Animal{
        //we use the same or matching constructor for child class as we did for parent class
        public Dog(String name, String color, String breed, int age) {
            super(name, color, breed, age);
        }
    }
    ///here we create another child class of cat.
    class cat extends Animal{
        public cat(String name, String color, String breed, int age) {
            super(name, color, breed, age);
        }
    }