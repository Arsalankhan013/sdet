package review6variables;

public class Hospital {

    public static void main(String[] args) {

        Doctor doc=new Doctor("Jane","smith");
        System.out.println(doc.firstName);
        System.out.println(doc.lastname);

        Doctor.hospital="UCSF";
        doc.work();// calling static variable
// Creating another doctor

        Doctor doctor= new Doctor("joe","doe", "Cardialogyst",10);
doctor.printInfo();
doctor.work();


// Changing value of static variable

Doctor.hospital="George Washington";
doc.work();


doc.lastname="obama";
doc.printInfo();
doctor.printInfo();

doc.hospital="Mayo Clininc";


    }
}
