package class19inheritance;

public class Parent {

    String name="Mihsa";
    double money=1000;
}
class Child extends Parent{// Accessing the parent class with extend keyword
    void printINfo(){
        System.out.println("My full name is  " + name);
    }
    void buyCAr(){
        System.out.println("buying car from papas money " + money);
    }
}

class tester{  // created a new class for tester
    public static void main(String[] args) {
        Child child=new Child();
        child.printINfo();
        child.buyCAr();
    }
}