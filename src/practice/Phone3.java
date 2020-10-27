package practice;

public class Phone3 {  //methods and constructors parameterization

    String name;
    int age;
    String PhoneMdel;
    int price;


    public Phone3(String NameOfThePhone, int PriceOfThePhone){
        this.PhoneMdel= NameOfThePhone;
        this.price=PriceOfThePhone;
    }


    public static void main(String[] args) {
        Phone3 phone3 = new Phone3("Apple", 1000);
        phone3.PrintMyName("lyes", 100);

        phone3.PrintPhoneInfo();
        phone3.PrintAll("Lyes", "Iphone",1000, 100);

    }

    public void PrintMyName(String name, int age){
        System.out.println("My name is :"+ name);
        System.out.println("My age is :"+ age);
    }
    public void PrintPhoneInfo(){
        System.out.println("The Phone Brand is :"+PhoneMdel);
        System.out.println("The price of the phone is USD "+price);
    }

    public void PrintAll(String name, String PhoneMdel, int price, int age){
        System.out.println("My name is "+name+" and I'm "+age+" years old ."+"Today I bought an "+PhoneMdel+" with USD"+price);
    }

}
