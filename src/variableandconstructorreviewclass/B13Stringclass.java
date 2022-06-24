package variableandconstructorreviewclass;

public class B13Stringclass {

    //Best practice is to try to make all of your instance variable as private
    private String str;


    public B13Stringclass(String str) {
        int number;
//this.number; Error there is no instance variable
        this.str = str;
    }
// write a method that can tell me how many times a character is being repeated in a string

    public int countChars(char c) {

        int counter = 0;// will keep track of number of occurance

        for (char cha : str.toCharArray()) {
            if (cha == c) {
                counter++;
            }

        }
        return counter;
    }

//Write a method


    public void printCHars(char c) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == c) {
                counter++;
            }

        } System.out.println(c + " Has appeared " + counter + " Inside this string");


    }
}