package class16;

public class AccessModifiersDemo1 {

    String password="pass123";
    int SSN=123;
    String name="Karla";

    public static void main(String[] args) {
        AccessModifiersDemo1 ac =new AccessModifiersDemo1();
        System.out.println(ac.password);
        System.out.println(ac.SSN);
        System.out.println(ac.name);
    }


}
