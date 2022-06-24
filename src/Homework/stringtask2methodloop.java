package Homework;

public class stringtask2methodloop {
    public static void main(String[] args) {

    String aa="arsalan";
   String task =reversed(aa);
        System.out.println(task);

    }

    private static String reversed(String str) {
        StringBuilder aa = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {

            aa.append(str.charAt(i));

        }
        return aa.toString();
    }
}