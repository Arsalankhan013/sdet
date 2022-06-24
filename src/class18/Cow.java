package class18;

public class Cow {

    String breed;
    String color;

    int age;
    double weight;

    Cow(String breed, String color, int age,double weight){
// when we have same name variables as local and as instance inside a class
 //Always local variables are prefared over instance variable by java in a block of code
       // breed=breed;
        //color=color;
        //age=age;
       // weight=weight;
// We will use this keyword it will assign to instance variable

        this.breed=breed;
        this.color=color;
        this.age=age;
        this.weight=weight;


    }

    String printCowInfo(){
        return "Breed " +breed+" color "+color+ " Age "+age+" weight "+ weight;
    }
}
