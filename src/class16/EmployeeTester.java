package class16;

import class17.Employee;

public class EmployeeTester {

    public static void main(String[] args) {
        Employee employeee=new Employee();
        employeee.name="merve";
      //  employeee.salary=123123123;// Cant access because it is private
       // employeee.department="IT";/// cant access
        System.out.println(Employee.manager);
        Employee.printmanager();
    }



}
