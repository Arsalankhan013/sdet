package class21methodoverloading;

public class Employee {
    String name;
    int basesalary=30000;
    int baseHolidays=10;

    void calculateSalary(){
        System.out.println(basesalary);
    }

void calulatePrintHolidays(){
    System.out.println(baseHolidays);
}


}

class OfficeBoy extends Employee{
    // we didnt specify any method here. there for it will take same values as parent
}
class Manager extends Employee {

    void calulatePrintSalary() {
        System.out.println((basesalary * 3) + 20000);
    }
        void calulatePrintHolidays() {
            System.out.println(baseHolidays * 3);

        }
    }

    class Developer extends Employee{


        void calulatePrintSalary() {
            System.out.println((basesalary * 2) + 20000);
        }
        void calulatePrintHolidays() {
            System.out.println(baseHolidays * 2);

        }

}

class QA extends Employee{
    void calculatePrintSalary(){
        System.out.println(basesalary*2+200000);
    }

    void calculatePrintHolidays(){
        System.out.println(baseHolidays*3);
    }
}
