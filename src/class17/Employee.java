package class17;

public class Employee {

    public String name;
public static String manager="Cinfy";
    private int salary;

    String department;

    private void printSalary(){
        System.out.println("Salary " + salary);
    }

    public static void printmanager(){
        System.out.println(manager);
    }



    void printDepartmetn(){

        System.out.println("department " + department);

    }

    public void printName(){
       // System.out.println(name);
    }

    public static void main(String[] args) {


        Employee emp=new Employee();
        emp.name="Jason";

    }



}
