package Homework;

public class Task8 {

    /*
    Write a Student class   that have instance variables name and address.
     Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.

     */


    String name;
    String city;
    String address;

    Task8(String name, String city,String address) {
        this.name = name;
        this.address = address;
        this.city=city;

    }
    void displayInfo(){
        System.out.println(name+" and his city is "+city+ "and address is"+ address);
    }

    public static void main(String[] args) {
        Task8 task8=new Task8(" Arsalan"," Calgary"," Elbow drive");
        task8.displayInfo();
    }
}

