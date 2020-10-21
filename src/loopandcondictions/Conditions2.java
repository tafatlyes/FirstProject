package loopandcondictions;

public class Conditions2 {

        static int a = 20;
        static int b = 15;
        static int c = 25;


    public static void main(String[] args) {

        if (b == 20){ // conditions for B
            System.out.println("a equal to b!");
        }
        else if (b > 20){
            System.out.println("b superior to a");
        }
        else {
            System.out.println("b inferior to a");


            if (c == 20){     // conditions for C
                System.out.println("a equal to c!");
            }
            else if (c > 20){
                System.out.println("c superior to a");
            }
            else {
                System.out.println("c inferior to a");
            }
        }

    }
}
