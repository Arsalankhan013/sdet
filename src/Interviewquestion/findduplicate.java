package Interviewquestion;

import java.util.Arrays;

public class findduplicate {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 40, 40};
        arr=removeduplicates(arr);
        System.out.println(Arrays.toString(arr));

    }

  static int[] removeduplicates(int[] arr) {

        int[] newArr = new int[arr.length];
int counter=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i]== arr[j]) {
                    newArr[i] = arr[i];
                    counter++;

                }

            }
        }
        int [] arr2=new int[arr.length-counter];
        return arr2;
    }
}











