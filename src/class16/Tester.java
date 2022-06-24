package class16;

import class17.Employee;// when we access class in other package we must use keyword import

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();


        String str=new String(); // we dont see any import because this class
        //present inside the java.lang
        //all the classes inside the java.lang package are imported by default for you
        System.out.println(ac.SSN);
        System.out.println(ac.name);

        Employee emp=new Employee();
        Scanner scanner=new Scanner(System.in);



    }


}
