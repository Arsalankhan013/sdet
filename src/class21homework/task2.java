package class21homework;

import java.sql.SQLOutput;

public class task2 {


    static  void sayHello(){
        System.out.println("Hello Batch 13");
    }

    static void sayHello(String msg){
        System.out.println(msg);
    }
static void sayHello(String msg, int times){

      for (int i=0; i<times; i++)  {
          System.out.println(msg);
      }
}

    public static void main(String[] args) {
        sayHello("hi",3);
    }
}
