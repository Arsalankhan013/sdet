package class20nheritance;
///multilevel inheritance
public class Vehicle {

    int engineHP;
    String make;
    String model;
    String color;

class Car extends Vehicle{
    String steeringType;
    boolean autoPilot;
    int noOfwindows;
}
class BMW extends Car{
    int topSpeed;
    void printBasicInfo(){
        engineHP=500;
        System.out.println(engineHP);
    }
}

}
