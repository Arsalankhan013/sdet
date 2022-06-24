package class15;

public class instancedemo {



        String str="instance";
        void changeInstanceValue(){
            str="Captain Marvel";
        }

        void printIstanceValue(){
            System.out.println(str);
        }

        public static void main(String[] args) {
            instancedemo id=new instancedemo();
            System.out.println(id.str); // prints the value of str which is instance
            id.printIstanceValue(); // method once simple prints the value of str which is still instance
            id.changeInstanceValue(); //this method changes the instace variable
            id.printIstanceValue();
        }
    }

