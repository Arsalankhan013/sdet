package Homework;

public class methodarray {

/*
Create a method that will accept an array as parameters
and will return a sum of all elements from that array.
Method should be visibly only within same package and
accessible by the creating an instance of the class.

 */

    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
methodarray smarray=new methodarray();
smarray.printArray(a);
int sum=smarray.SumOfArray(a);
        System.out.println(sum);
    }
    void printArray(int [] ar) {

        for (int num : ar) {

            System.out.println(num);
        }
    }

       static int SumOfArray(int ar[]) {
        int sum=0;
        for (int i = ar[0]; i < ar.length; i++) {
            sum += ar[i];

        }
        return sum;
    }

    }



