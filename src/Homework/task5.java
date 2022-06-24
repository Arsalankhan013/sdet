package Homework;

public class task5 {

    /*

    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */


    String name;
    int sub1grade;
    int sub2grade;
    int sub3grade;


    task5(String Sname, int grade1, int grade2, int grade3){

        name=Sname;
        sub1grade=grade1; // whenever the name of instance vaiable== name of constructor variable
        // than we need to use this statement
        sub2grade=grade2;
        sub3grade=grade3;

    }

     public void getAverage(){
       int avg;
       avg=(sub1grade+sub2grade+sub3grade)/3;
       System.out.println("Average mark of " + name+" " +avg);
    }


}



