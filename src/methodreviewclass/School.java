package methodreviewclass;

public class School {

    public static void main(String[] args) {
        student student1=new student();

student1.name="arsalan";
        student1.lastname="khan";
        student1.address="calgary";
        student1.studentid=101;
        student1.grade='A';
       String fullname=student1.getFullName();
        System.out.println(fullname);


        student student2=new student();
        student2.name="aby";
        student2.lastname="meoww";
        student2.address="California";
        student2.age=18;
        student2.grade='B';
        student2.studentid=19;
        student2.study();
        student2.printinfo();
        System.out.println(student2.grade);
String st2name=student2.getFullName();
        System.out.println(st2name);
    }


}
