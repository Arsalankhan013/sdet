package class20super;
// we use Super in inheritance to avoid conflict
// e.g in below example there is conflict between String color
public class SuperDemo {
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
    //


}

class Wood{
   String color="blue";

}



class Furniture extends Wood{

    String color="Black";


}

class Chair extends Furniture{

    String color="grey";
    void printColor(){
        String color="white";
        System.out.println(super.color);// used super keyword will print color frm parent otherwise prefrencee will
        //be given to closest or local variable.
        System.out.println(super.color);
        System.out.println(this.color);// this keyword to acces its parent class
        System.out.println(color);


    }

}

