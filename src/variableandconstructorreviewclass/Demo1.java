package variableandconstructorreviewclass;

public class Demo1 {
    public static void main(String[] args) {
        char [] arr={'a','b','c'};
        String str=new String(arr);// constructor helped us create array
        System.out.println(str);

        int [] arr2={64,66,67,68,69,73,79};// From table 65=A

        String str2=new String(arr2,0,5);
        System.out.println(str2);

       String name="Arsalan khan";
       if(name.length()>10){
           System.out.println("please use shorter name");
       }else {
           System.out.println("it is name has accepted");
       }

    }
}
