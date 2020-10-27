package parameterization;

public class ConstructorParameter {
    static String name;

    public ConstructorParameter(String NameOfTheCar){
        this.name=NameOfTheCar;
    }


    public static void main(String[] args) {
        ConstructorParameter groupStudy1 = new ConstructorParameter("Toyota");
        CarName();
    }

    public static void CarName(){
        System.out.println(name);
    }
}
