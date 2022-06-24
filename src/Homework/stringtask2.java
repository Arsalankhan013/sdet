package Homework;

public class stringtask2 {
/*
Create a method that will take a String as a parameter and returns reversed String.
Method should be available to
all classes within your project
and accessible by class name.

 */
public static void main(String[] args) {

    String aa="stringvalue";
    String arsalan=reverse(aa);
    System.out.println(arsalan);
}
//

public static String reverse(String str){
    return new StringBuilder(str).reverse().toString();//method chaining

//static allows us to allow the method by callling the class name
    // with static we dont have to create a class name

}



}
