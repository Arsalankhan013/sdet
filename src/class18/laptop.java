package class18;

public class laptop {

    String make;
    String model;
    String storage;
    String memory;
    double screensize;

    public laptop(String make) {
        this.make = make;}

    public laptop(String make, String model) {
        this.make = make;
        this.model = model;

    }
    public laptop(String make, String model, String storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }
    public laptop(String make, String model, String storage,String memory) {
        this.make = make;
        this.model = model;
        this.storage = storage;
        this.memory = memory;

    }
    public laptop(String make, String model, String storage,String memory, double screensize) {
        //this.make = make; // very common practice
        // this.model = model;
        //this.storage = storage;
        //this.memory = memory;
        // this.screensize=screensize;
        // lots of repition to avoid will call constructor below
        this(make, model, storage, memory);// very rare practice
        this.screensize = screensize;
    }

    public static void main(String[] args) {

        laptop apple=new laptop("apple","M1","512", "16",14.4);
    }

}
