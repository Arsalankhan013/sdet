package review6variables;

import java.sql.SQLOutput;

public class Doctor {


    //There are instance variable since it is declared inside the class
    String firstName,lastname,speciality;

    int experience;
    double salary;

    static String hospital;
    //Variable inside () are local variables
    // java always prefers local variables
Doctor(String firstName, String lastname){
    this.firstName=firstName;
    this.lastname=lastname;

}
Doctor(String firstName, String Lastname,String speciality, int experience){

this(firstName, Lastname);
this.speciality=speciality;
this.experience=experience;
}

void printInfo(){

    System.out.println("Doctor name is " + firstName +" " + lastname + " speciality is " + speciality);
}
void work(){
    System.out.println(firstName + " works at " + hospital);


}

}
