package class20super;

public class Bird {

    String name;
    String color;
    int age;
    double weight;

    void printInfo(){
        System.out.println("Name" + name+ " Color" + color);

}


Bird(String name,String color,int age,double weight){
        this.name=name;
        this.color=color;
        this.age=age;

}
class Parrot extends Bird{//constructor don't participate in inheritance
        // we cant use it but we call it from the parent class
        // we will use super keyword to call the constructor


    Parrot(String name,String color,int age,double weight){

        super(name,color,age,weight);
    }


    }
}