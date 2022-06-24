package class15;

public class task4 {
    //Create a method that will say Hello in different language based on the country
    // that will passed when method is executed
    //

    void sayHello(String country){

        String hello;
        switch (country){
            case"USA":
                hello="Hola";
                break;
            case"Russia":
                hello="Privet";
                break;
            case "France":
                hello="bonjour";
                break;

            case "Pakistan":
                hello="Salam";
                break;
            default:
                hello="country not found";

        }
System.out.println(hello);
    }

    public static void main(String[] args) {
        task4 ttask4=new task4();
        ttask4.sayHello("France");
    }

}
