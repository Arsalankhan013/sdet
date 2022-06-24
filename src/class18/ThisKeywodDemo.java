package class18;

public class ThisKeywodDemo {

    String name="instance";

    void printName(){
        String name="local";
        System.out.println(name);
        System.out.println(this.name);// this will forward sout to instance variable^^^
    }

    public static void main(String[] args) {
        ThisKeywodDemo t=new ThisKeywodDemo();
        t.printName();
    }
}
