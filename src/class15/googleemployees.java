package class15;

public class googleemployees {


    String name; // instance variable
    double salary; // instance
    static int noOfEmployees; // Static
    static String companyname="Google";

    void displayEmployeeInfo(){
        System.out.println("Name " +name+" Cpmpany Name" + companyname);


    }

    public static void main(String[] args) {
        googleemployees emp1=new googleemployees();
        emp1.name="Arsalan";
        emp1.salary=250000;
        emp1.noOfEmployees=1;
        emp1.displayEmployeeInfo();

        googleemployees emp2=new googleemployees();
        emp2.name="khan";
        emp2.salary=250002;
        emp2.noOfEmployees=1;
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();

    }


}
