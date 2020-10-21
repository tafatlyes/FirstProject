package practice;

public class Phone {

    String model;

    public Phone (String nameOfThePhone){
        this.model=nameOfThePhone;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("Galaxy");
        phone1.printPhone();
    }

    public void printPhone(){
        System.out.println(model);
    }

}
