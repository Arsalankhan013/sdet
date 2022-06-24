package class15;

public class homework {

//Create a method that will take 2 parameters
// as a numbers and prints which number is larger.

    void printlarger(int num1, int num2) {


        int larger = 0;
        if (num1 > num2) {
            larger = num1;

        } else if (num2 > num1) {

            larger = num2;

        } else {
            larger = num1;
        }
        System.out.println(larger);
    }

    public static void main(String[] args) {

        homework task1=new homework();
        task1.printlarger(10,8);
    }
}
