package class15;

public class Task2 {

    void printEvenOrODD(int number){

        if(number%2==0){

            System.out.println("Number is Even");
        }else{

            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {

        Task2 task2=new Task2();
        task2.printEvenOrODD(2);
    }


}
