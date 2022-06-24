package Homework;

public class homework3methodaeiou {

/*
Create a method that will accept a String as a
parameter and return a new String that consist
only of vowels. Method should be available inside
the class only where it was declared and executed by calling it is name.


 */
public static void main(String[] args) {

 String cvowels="aeoooooodfdfoidu";

 String aa=getVowels(cvowels);
 System.out.println(aa);
 System.out.println(getVowels("khan"));
}

 private static String getVowels(String str){
return str.replaceAll("[^aeiou]","");

}


}
