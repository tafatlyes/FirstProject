package practice;

public class Phone1 { //constructor parameterization

    String brand;

    public Phone1(String nameOfTheCompany){
        this.brand=nameOfTheCompany;

    }

    public static void main(String[] args) {
        Phone1 Phone1 = new Phone1("Apple");
        Phone1.PrintPhoneModel();
    }

    public void PrintPhoneModel(){
        System.out.println(brand);
    }
}
