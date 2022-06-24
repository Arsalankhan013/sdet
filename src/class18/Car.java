package class18;

public class Car {

    private String make; // try to make field private most the times for privacy
   private  String model;
    private String color;
  // how to create a constructor for this class
    //constructor most the times are public

    public Car(){//  Empty constructor:


    }

    public Car(String carMake, String carModel, String carColor){
        make=carMake;
        model=carModel;
        color=carColor;
    }
    public Car(String carModel){
        model=carModel;
    }

    void printCarModel(){
        System.out.println("model " + model);
    }


    void printInfo(){
        System.out.println("CarMake " + make + " Model" +model + "Color " + color);


    }





}
