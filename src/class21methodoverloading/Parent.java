package class21methodoverloading;

public class Parent {

    String name;

    void getMarried() {
        System.out.println("heeeyy howkjk you doing");
    }
}
class Son extends Parent{

    void getMarried() {
        super.getMarried();

        System.out.println("heeeyy how you doing");

    }

    public static void main(String[] args) {
        Son son=new Son();
        son.getMarried();
    }
}
