package class18;

public class CarTester {

    public static void main(String[] args) {
        Car car1=new Car("Audi", " GT", "Black");
        car1.printInfo();

        Car car2=new Car("Toyota", "camry","white");
        car2.printInfo();

        Car car=new Car(); // no parameter needed because we are are accessing empty constructor
        car1.printInfo();
        car2.printCarModel();
    }
}
