package class19inheritance;

public class SDET extends Human {

    boolean goodWithJava;

SDET(String name,String eyeColor,String job,int age,boolean goodWithJava){

    // this .name is coming from parent class


    this.name=name;
    this.job=name;
    this.eyecolor=eyeColor;
    this.job=job;
    this.age=age;
this.goodWithJava=true;
}
void printInfo()
{
    System.out.println("my name is " +name + " i do "+ job + "my eye color is "
            + eyecolor + " my age is "+" "+ age + goodWithJava);
}

    public static void main(String[] args) {
        SDET sdet=new SDET("Arsalan", "black ","Java ", 27, true);
        sdet.printInfo();
    }

}
