package class17;

public class Dog {

    String name;
    String color;
    String breed;
    int age;
    double weight;
Dog(String dogName,String dogBreed, String dogColor,int dogAge,double dogWeight){
   name=dogName;
   breed=dogBreed;
   color=dogColor;

   if (dogAge<25 && dogAge>0) {
       age = dogAge;
   }else {
       System.out.println("Dog cant be greater than 25 and less than 0"); }

   weight=dogWeight;
}
    void printInfo(){
        System.out.println("Name " + name + " Breed " +breed + " Color "+color+ " Weight "+weight);
    }

    public static void main(String[] args) {
       // Dog dog1=new Dog();// will get error ; because Dog() is constructor
        // to call the Dog constructer , must specify the value
       /* dog1.name="Lofy ";// construction of an object
        dog1.breed="GERMAN";
        dog1.color="Black";
        dog1.age=15;
        dog1.weight=20;
        dog1.printInfo();

        Dog dog2=new Dog();
        dog2.name="Loy ";// construction of an object
        dog2.breed="american";
        dog2.color="white";
        dog2.age=10;
        dog2.weight=25;
        dog2.printInfo();
 */

    }
}
