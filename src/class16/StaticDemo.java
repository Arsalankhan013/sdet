package class16;

public class StaticDemo {

    static int noOfEmployees=10;
    String name;

    static void method1(){
        System.out.println(noOfEmployees);/// only single method
    }

    void method2(){

    }

    public static void main(String[] args) {
        StaticDemo st=new StaticDemo();
        st.name="Omid";

        StaticDemo st2=new StaticDemo();
        st2.name="arsalan";

    }

}
