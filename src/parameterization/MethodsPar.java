package parameterization;

public class MethodsPar {

    public static void main(String[] args) {
        MethodsPar methodsPar = new MethodsPar();
        methodsPar.printName("LYES");
        methodsPar.info("NY", 02154);
    }

    void printName(String studentname){
        System.out.println(studentname);
    }

    void info(String city, int zipcode){
        System.out.println("the city is "+city+ "and the zip code is "+zipcode);
    }
}
