package Homeworkinheritance;

import java.sql.SQLOutput;

class classa {
//
//Write program to inherit class A
// that has method printF which is static and call or reuse that method into class B


   public static void printF(){
        System.out.println("inheritance homework task 2");
    }


}
class B extends classa {


    }
class f{
    public static void main(String[] args) {
        B.printF();
    }
}
