package Stringsmanupulation;

import java.util.Arrays;

public class reversestring {

    public static void main(String[] args) {
        String name="Arsalan";
        char [] reversearray=name.toCharArray();
        //int length=reversearray.length;
        //System.out.println(length);
        for (int i=(reversearray.length-1); i>=0; i--){

            System.out.println(reversearray[i]);
    }

}


}




