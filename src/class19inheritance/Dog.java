package class19inheritance;
// benefit of inheritance
//instead of rpeating multiple classes we can create a parent class
//eg we dont have to create a separate class for dog but we can create an animal class
//public class Dog {
    //String name;
    //String breed;
   // String color;
   // int weight;

import java.sql.SQLOutput;

class Animal{

    String name;
    String breed;
    String color;
    int age;
    double weight;
    void printInfo(){
        System.out.println("Name " + name +" color" + color);
    }
}
 public class Dog extends Animal {

    Dog(String name,String color){
        this.name=name;
        this.color=color;
    }
}
class Cat extends Animal{

    Cat(String name, String color){
        this.name=name;
        this.color=color;
    }
}