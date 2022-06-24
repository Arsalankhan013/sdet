package Homeworkinheritance;
//Write a Java program called Teacher.
// Identify features and behaviour of that Class.
// Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
// that would have it their own features and behaviour.
// Test all 4 classes
public class Task3 {

    public static void main(String[] args) {


        ChemTeacher cteacher=new ChemTeacher();
        MathTeacher mteacher=new MathTeacher();
        PianoTeacher pteacher=new PianoTeacher();








        cteacher.name="Arsalan";
        cteacher.favchemsubject="organic";
cteacher.teachesChem();


    }







}
class Teacher{
    String name;
    String typeOfTeaacher;
    void teach(){
        System.out.println(name+"Teaches "+typeOfTeaacher);
    }
}

class MathTeacher extends Teacher{
    String mathsubject;
    public void teachesMath(){
        System.out.println(name+" "+ " teaches math and fav subject is "+mathsubject);
    }

}

class ChemTeacher extends Teacher{

    String favchemsubject;
    public void teachesChem(){
        System.out.println(name + " "+ " Teaches Chemistry and his fav math subject is " + favchemsubject);
    }

}

class PianoTeacher extends Teacher{

    String favpianosubject;
    public void teachesPiano(){
        System.out.println(name + " "+ " Teaches Chemistry and his fav math subject is " + favpianosubject);
    }

}
