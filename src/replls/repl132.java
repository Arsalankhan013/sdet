package replls;

public class repl132 {
/*
Complete the reduce10 method by making it subtract 10 from every element of the double array nums.
The method should static and it should return a new 2D array object
Print values from new array in the format below input

1 2 3 4
4 5 6 7
1 3 5 7


-9 -8 -7 -6
-6 -5 -4 -3
-9 -7 -5 -3


 */
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);
        //print the elements from new array
        for(int i=0; i<a.length;i++){

            for(int j=0; j<a[i].length;j++){

                System.out.print(a[i][j]+ " ");
            }
            System.out.println();

        }



    }
    //create method reduce10 here
    public static int[][] reduce10(int [][]arr){

        for(int i=0; i<arr.length;i++){

            for(int j=0; j<arr[i].length;j++){

                arr[i][j]=arr[i][j]-10;
            }

        }
        return arr;

}

}
