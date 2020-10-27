package Try;

public class Condition {

    public static void main(String[] args) {
        String Today = "Thursday";


        if (Today.equalsIgnoreCase("Saturday")) {
            System.out.println("We have a study group");
        }
        else if (Today.equalsIgnoreCase("Friday")){
            System.out.println("I'm free");
        }
        else if (Today.equalsIgnoreCase("saturday")){
            System.out.println("We have a java class");
        }
        else {
            System.out.println("Just watch TV and relax");
        }
    }


}


