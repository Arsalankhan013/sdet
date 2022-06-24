package class17;

public class Task2Student {
    /*

Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students

     */

    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {

        Task2Student task2s=new Task2Student();
        task2s.name="arsalan";
        task2s.id="JB123";
        numberOfStudents=1;// if we are inside the same class we can access static variable inside static methods
        //by just writing the name of that variable we dont need to create an object.

        System.out.println(numberOfStudents);

        Task2Student task3s=new Task2Student();
        task2s.name="arsalan1";
        task2s.id="JB2123";
        numberOfStudents=2;
        System.out.println(numberOfStudents);
    }


}
