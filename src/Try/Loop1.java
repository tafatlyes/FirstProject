package Try;

public class Loop1 {

    public static void main(String[] args) {
        for (int i=0; i<5;i++){                       //i=0 , i=1
            System.out.println("I love Java");
        }
            for (int j=0; j<3; j++){                 //j=0 , j=1, j=2
                System.out.println("I love food");
                for (int k=0; k<2; k++){
                    System.out.println("I hate java");
                }
            }
        }
    }

