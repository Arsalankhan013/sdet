package class15;

public class Task5 {
    /*

Create a method createEmail(). Based on values of users name,
lastName and email type, your method should return complete email Address.
Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or


     */
String completeEmail(String firstName,String lastName, String email){

    return firstName+lastName+"@"+email+".com";
}

    public static void main(String[] args) {
        Task5 task5=new Task5();
        System.out.println(task5.completeEmail("arsalan","khan","gmail"));
    }


}
