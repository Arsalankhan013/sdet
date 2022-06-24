package class20nheritance;

public class Laptop {

    int storage=512;
    int RAM=32;

    protected String make;
    protected String model;/// with help of protected keyword we can pass make information
    // to another inherited class in a different package
    void printMode(){
        System.out.println(model);
    }

}
