package Homeworkinheritance;

class car {
    String make;
    String model;
    int serialnumber;

    void printinfo(){
        System.out.println("Make of the vehicle is" + make + " model of the vehicel is " +
                model + "Serial number of the vehicle is "+ serialnumber
                );
    }

}
class car1 extends car{
    car1(String make, String model,int serialnumber){
        this.make=make;
        this.model=model;
        this.serialnumber=serialnumber;

    }

}

class car2 extends car{
    car2(String make, String model,int serialnumber){
        this.make=make;
        this.model=model;
        this.serialnumber=serialnumber;

    }

}