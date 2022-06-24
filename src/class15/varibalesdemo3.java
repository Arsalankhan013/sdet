package class15;

import java.util.Locale;

public class varibalesdemo3 {


    static int num=5;
    String name;

    public static void main(String[] args) {

        varibalesdemo3 v1=new varibalesdemo3();
        v1.name="Arsalan";

        varibalesdemo3 v2=new varibalesdemo3();
        v2.name="jason";

        varibalesdemo3 v3=new varibalesdemo3();
        v2.name="Khan";

        System.out.println(v1.name.toUpperCase(Locale.ROOT));
    }

}
