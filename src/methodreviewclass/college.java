package methodreviewclass;

public class college {

    public static void main(String[] args) {
        student stu =new student();
        stu.name="arsalan";
        stu.lastname="kahn";
stu.grade='D';
        //Accessing methods

        stu.getFullName();

        //below 2 methods has a return type of string

        System.out.println(stu.getFullName());
String rating=stu.rating();
        System.out.println(rating);
        stu.takeSubject("BIO",2);
        System.out.println(stu);
    }
}
