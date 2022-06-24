package Homework;
// Create a class called Students
/*
Create three variable Name, ID and numberOfStudents
Create three Objects of the Student Class
Set the value for studentName, studentID and increment the numberOfStudents for each object
Print out total number of students




 */
public class Task2homeworkvariable {
  String name;
  String id;

static int numberOfStudents;

  public static void main(String[] args) {

    Task2homeworkvariable task2Students=new Task2homeworkvariable();
    task2Students.name="Arsalan007";
    task2Students.id="JB123";
    numberOfStudents=1;// if we are inside the same class we can access static variables inside static
    //methods by just writing the name of that variable we dont need to create an object
    System.out.println(task2Students.name);
    System.out.println(task2Students.id);
    System.out.println(numberOfStudents);

    Task2homeworkvariable task2Students2=new Task2homeworkvariable();




  }


}
