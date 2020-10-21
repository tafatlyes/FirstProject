package practice;

public class Phone2 {

    String name;
    public Phone2(String nameOfThePhone){
        this.name=nameOfThePhone;
    }

    public static void main(String[] args) {
        Phone2 phone2 = new Phone2("Galaxy");
        phone2.PrintName();
    }

    public void PrintName(){
        System.out.println(name);
    }



}
