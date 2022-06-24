package methodreviewclass;

public class student {
    // define fields =variables/properties/accessories
    String name,lastname,address;
    int studentid,age;
    char grade;
    // define behaviour=methods in java writing a behavour is methods
    void study(){
        System.out.println(name + " is studying");
    }
    void doHomework(){
        System.out.println(name + " is doing homework");
    }
    // create a method that will return full name of a student in uppercase.
    String getFullName(){
       return name.toUpperCase() +" "+ lastname.toUpperCase();
    }
//Create a method to print full info of the student
    //(full name age id address grade)
    void printinfo(){
        System.out.println(name+" "+lastname+" "+"lives in " + address+" his student id is "+
                studentid+" his grade is "+grade);
    }
// Create a mwthod that will return wether the student is great
    //good bad or average
    //based on the grade

    String rating() {   // String rating() method header code inside {} is method
        switch (grade) {
            case 'A':
                return "You are an excellent student god damn!";
            case 'B':
                return ("You are good student ");
            case 'C':
                return ("You are ok student ");
            case 'D':
                return ("need to work hard ");
            default:
                return "please enter a grade from A-D";
        }
    }
        void takeSubject(String subject, int numbers){
            System.out.println(name + " Studies" + subject+" Number of he studies subjext " + numbers);

        }


    }



