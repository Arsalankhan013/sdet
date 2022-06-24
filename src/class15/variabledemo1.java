package class15;

public class variabledemo1 {

    String name; //  instance variable because its not inside a method


    static int num=5; // static



    void printName(){

        String name="Local";  // local variable
        System.out.println(name);
    }

    public static void main(String[] args) {
        variabledemo1 v = new variabledemo1();
       v.printName();
String.valueOf("v");

    }

}
